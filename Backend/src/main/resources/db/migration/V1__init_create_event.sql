CREATE TABLE events (
                        id BIGINT AUTO_INCREMENT PRIMARY KEY,
                        titre VARCHAR(255) NOT NULL,
                        description TEXT,
                        lieu VARCHAR(255),
                        date_debut DATETIME NOT NULL,
                        date_fin DATETIME NOT NULL,
                        statut VARCHAR(50) NOT NULL
);