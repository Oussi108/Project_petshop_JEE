CREATE TABLE product (
   idproduct INT PRIMARY KEY,
   name VARCHAR(255),
   image VARCHAR(255),
   information TEXT,
   categorie VARCHAR(255),
   price DECIMAL(10, 2)
);
CREATE TABLE users (
   idUsername INT PRIMARY KEY,
   Username VARCHAR(255),
   Password VARCHAR(255),
   Email VARCHAR(255),
   Phone VARCHAR(255),
   Company VARCHAR(255),
   Adrres VARCHAR(255)
);
CREATE TABLE cartcommand (
   ididUsername INT,
   idproduct INT,
   dateAdd DATE,
   Qty INT,
   PRIMARY KEY (ididUsername, idproduct),
   FOREIGN KEY (ididUsername) REFERENCES users(idUsername),
   FOREIGN KEY (idproduct) REFERENCES product(idproduct)
);
CREATE TABLE SpecialOffers (
   idoffer INT PRIMARY KEY,
   idproduct INT,
   percentage DECIMAL(10, 2),
   FOREIGN KEY (idproduct) REFERENCES product(idproduct)
);
CREATE TABLE contact (
   idcontact INT AUTO_INCREMENT PRIMARY KEY;
   Name VARCHAR(255),
   Email VARCHAR(255),
   Phone VARCHAR(255),
   Company VARCHAR(255),
   Message VARCHAR(255)
);
---------------------------------------------------------------------------
INSERT INTO product (idproduct, name, image, information, categorie, price)
			VALUES (1, 'Product1', 'thumb1.gif', 'This is a sample product', 'category1', 100.00),
				   (2, 'Product2', 'thumb3.gif', 'This is another sample product', 'category2', 150.00),
				   (3, 'Product3', 'thumb2.gif', 'This is yet another sample product', 'category3', 200.00);
INSERT INTO user (idUsername, Username, Password, Email, Phone, Company, Adrres)
			VALUES (1, 'user1', 'password1', 'user1@example.com', '1234567890', 'company1', 'address1'),
				   (2, 'user2', 'password2', 'user2@example.com', '0987654321', 'company2', 'address2'),
				   (3, 'user3', 'password3', 'user3@example.com', '1212121212', 'company3', 'address3');
INSERT INTO cartcommand (ididUsername, idproduct, dateAdd, Qty)
			VALUES (1, 1, '2022-01-01', 2),
					(1, 2, '2022-01-01', 1),
					(2, 3, '2022-01-02', 3);
INSERT INTO SpecialOffers (idoffer, idproduct, percentage)
			VALUES (1, 1, 0.2),
				   (2, 2, 0.1),
				   (3, 3, 0.3);
INSERT INTO contact (Name, Email, Phone, Company, Message)
			VALUES ('John Doe', 'johndoe@example.com', '1234567890', 'ACME Inc.', 'I have a question about your products'),
				   ('Jane Smith', 'janesmith@example.com', '0987654321', 'ABC Corp.', 'I am interested in your services'),
				   ('Bob Johnson', 'bobjohnson@example.com', '1212121212', 'XYZ LLC.', 'Just wanted to say thank you for your support');
