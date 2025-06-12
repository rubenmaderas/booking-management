CREATE TABLE usuarios (
                          id UUID PRIMARY KEY,
                          nombre VARCHAR(100) NOT NULL,
                          correo_electronico VARCHAR(100) UNIQUE NOT NULL,
                          rol VARCHAR(10) CHECK (rol IN ('USER', 'ADMIN')) NOT NULL
);

CREATE TABLE salas (
                       id UUID PRIMARY KEY,
                       nombre VARCHAR(100) NOT NULL,
                       capacidad INT NOT NULL,
                       ubicacion VARCHAR(100),
                       equipamiento VARCHAR(255), -- Se puede usar JSON si se requiere más detalle
                       activa BOOLEAN DEFAULT TRUE
);

CREATE TABLE reservas (
                          id UUID PRIMARY KEY,
                          id_usuario UUID NOT NULL,
                          id_sala UUID NOT NULL,
                          fecha_inicio TIMESTAMP NOT NULL,
                          fecha_fin TIMESTAMP NOT NULL,
                          motivo VARCHAR(255),
                          estado VARCHAR(20) CHECK (estado IN ('CREATED', 'MODIFIED', 'CANCELLED')) NOT NULL,

                          FOREIGN KEY (id_usuario) REFERENCES usuarios(id),
                          FOREIGN KEY (id_sala) REFERENCES salas(id)
);

CREATE TABLE bloqueos_sala (
                               id UUID PRIMARY KEY,
                               id_sala UUID NOT NULL,
                               motivo VARCHAR(255),
                               fecha_inicio TIMESTAMP NOT NULL,
                               fecha_fin TIMESTAMP NOT NULL,

                               FOREIGN KEY (id_sala) REFERENCES salas(id)
);