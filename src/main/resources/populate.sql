-- Insert data into Suppliers table
INSERT INTO Suppliers (supplier_id, name, address, phone, email, contact_person)
VALUES
    (1, 'Großhandel GmbH', 'Bruckerstraße 4 38126 Braunschweig', '0531-1044101', 'Irene.Schneider@grosshandel.de', 'Irene Schneider'),
    (2, 'Lifer & Söhne', 'Haupstraße 43, 89073 Ulm', '0731-599821', 'sales.lieferundsoehne@gmx.com', 'Rudolph Lifer'),
    (3, 'Emmas Tomatenhandel', 'Wagengasse 2, Laupheim', NULL, NULL, 'Emma Pfefferle');

-- Insert data into Products table
INSERT INTO Products (product_id, name, supplier_id, stock_quantity, purchase_price, selling_price)
VALUES
    (1, '100g Paprikagewürz', 1, 500, 1.50, 1.99),
    (2, '100g gemahlener Pfeffer', 1, 300, 0.50, 0.99),
    (3, '150g Kardamom', 1, 400, 3.99, 4.99),
    (4, '100g Zimt', 1, 100, 1.50, 1.99),
    (5, '500g Cornflakes', 1, 800, 0.50, 2.99),
    (6, 'Leiter 2m', 2, 15, 40.00, 74.99),
    (7, 'Holzhammer', 2, 50, 7.00, 9.99),
    (8, 'Gummihammer', 2, 45, 4.50, 4.99),
    (9, 'Vorschlaghammer', 2, 78, 15.00, 23.49),
    (10, 'Der Turbohammer von König Dedede', 2, 1, 250.00, 299.99),
    (11, 'Tomate', 3, 1950, 0.20, 0.49);
