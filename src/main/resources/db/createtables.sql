create database adc;

use adc;
CREATE TABLE tags (
                      id INT PRIMARY KEY AUTO_INCREMENT,
                      name VARCHAR(255) NOT NULL
);

CREATE TABLE canvas (
                            id INT PRIMARY KEY AUTO_INCREMENT,
                            name VARCHAR(255) NOT NULL,
                            description VARCHAR(255) ,
                            tags ENUM('tag1', 'tag2', 'tag3', 'user_defined') ,
                            constraints VARCHAR(255) ,
                            dsa VARCHAR(255) ,
                            complexity VARCHAR(255) ,
                            code VARCHAR(255) ,
                            test VARCHAR(255)
);
CREATE TABLE canvas_tags (
                             canvas_id INT,
                             tag_id INT,
                             PRIMARY KEY (canvas_id, tag_id),
                             FOREIGN KEY (canvas_id) REFERENCES canvas(id),
                             FOREIGN KEY (tag_id) REFERENCES tags(id)
);