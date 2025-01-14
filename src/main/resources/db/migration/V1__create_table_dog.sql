CREATE TABLE DOG(
 id int NOT NULL PRIMARY KEY AUTO_INCREMENT, 
 breed varchar(100) NOT NULL,
 description varchar(255) NOT NULL,
 photos JSON NOT NULL
);


CREATE TABLE ATTRIBUTE(
  id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
  dog_id int NOT NULL,
  affectionate_family int NOT NULL,
  affectionate_children int NOT NULL,
  affectionate_dogs int NOT NULL,
  level_preparation_coat int NOT NULL,
  fun int NOT NULL,
  openness_to_strangers int NOT NULL,
  level_adaptability int NOT NULL,
  level_training int NOT NULL,
  level_protection int NOT NULL,
  energy int NOT NULL,
  dilation int NOT NULL,
  CONSTRAINT fk_dog FOREIGN KEY (dog_id) REFERENCES DOG(id),
  CONSTRAINT unique_dog_attribute UNIQUE (dog_id)
);
