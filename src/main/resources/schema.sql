CREATE TABLE "Suppliers" (
                             "supplier_id" integer PRIMARY KEY,
                             "name" varchar(100) NOT NULL,
                             "address" varchar(200) NOT NULL,
                             "phone" varchar(20),
                             "email" varchar(100),
                             "contact_person" varchar(100)
);

CREATE TABLE "Products" (
                            "product_id" integer PRIMARY KEY,
                            "name" varchar(100) NOT NULL,
                            "supplier_id" int,
                            "stock_quantity" int DEFAULT 0,
                            "purchase_price" decimal(10,2) NOT NULL,
                            "selling_price" decimal(10,2) NOT NULL
);

CREATE TABLE "Customers" (
                             "customer_id" int PRIMARY KEY,
                             "name" varchar(100) NOT NULL,
                             "address" varchar(200) NOT NULL,
                             "phone" varchar(20),
                             "email" varchar(100)
);

CREATE TABLE "SupplierOrders" (
                                  "order_id" int PRIMARY KEY,
                                  "supplier_id" int NOT NULL,
                                  "order_date" timestamp NOT NULL,
                                  "delivery_date" timestamp,
                                  "total_cost" decimal(12,2),
                                  "status" varchar(20) DEFAULT 'pending'
);

CREATE TABLE "SupplierOrderItems" (
                                      "item_id" int PRIMARY KEY,
                                      "order_id" int NOT NULL,
                                      "product_id" int NOT NULL,
                                      "quantity" int NOT NULL,
                                      "unit_price" decimal(10,2) NOT NULL
);

CREATE TABLE "CustomerOrders" (
                                  "order_id" int PRIMARY KEY,
                                  "customer_id" int NOT NULL,
                                  "order_date" timestamp NOT NULL,
                                  "delivery_date" timestamp,
                                  "total_cost" decimal(12,2),
                                  "status" varchar(20) DEFAULT 'pending'
);

CREATE TABLE "CustomerOrderItems" (
                                      "item_id" int PRIMARY KEY,
                                      "order_id" int NOT NULL,
                                      "product_id" int NOT NULL,
                                      "quantity" int NOT NULL,
                                      "unit_price" decimal(10,2) NOT NULL
);

ALTER TABLE "Products" ADD FOREIGN KEY ("supplier_id") REFERENCES "Suppliers" ("supplier_id");

ALTER TABLE "SupplierOrders" ADD FOREIGN KEY ("supplier_id") REFERENCES "Suppliers" ("supplier_id");

ALTER TABLE "SupplierOrderItems" ADD FOREIGN KEY ("order_id") REFERENCES "SupplierOrders" ("order_id");

ALTER TABLE "SupplierOrderItems" ADD FOREIGN KEY ("product_id") REFERENCES "Products" ("product_id");

ALTER TABLE "CustomerOrders" ADD FOREIGN KEY ("customer_id") REFERENCES "Customers" ("customer_id");

ALTER TABLE "CustomerOrderItems" ADD FOREIGN KEY ("order_id") REFERENCES "CustomerOrders" ("order_id");

ALTER TABLE "CustomerOrderItems" ADD FOREIGN KEY ("product_id") REFERENCES "Products" ("product_id");
