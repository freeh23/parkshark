CREATE TABLE "Division" (
                            "div_id" serial PRIMARY KEY,
                            "div_name" varchar,
                            "div_original_name" varchar,
                            "div_director" varchar,
                            "div_upper_div_id" integer
);

CREATE TABLE "ParkingLot" (
                              "pl_id" serial PRIMARY KEY,
                              "pl_name" varchar,
                              "pl_max_cap" integer,
                              "pl_price_hour" float,
                              "pl_cat_id" integer,
                              "pl_address_id" integer,
                              "pl_contact_id" integer,
                              "pl_div_id" integer
);

CREATE TABLE "Category" (
                            "cat_id" serial PRIMARY KEY,
                            "cat_name" varchar
);

CREATE TABLE "Address" (
                           "add_id" serial PRIMARY KEY,
                           "add_street" varchar,
                           "add_housenum" varchar,
                           "add_zipcode" varchar,
                           "add_city" varchar
);

CREATE TABLE "Employee" (
                            "emp_id" serial PRIMARY KEY,
                            "emp_firstname" varchar,
                            "emp_lastname" varchar,
                            "emp_mobilephonenumber" varchar,
                            "emp_telephonenumber" varchar,
                            "emp_address" integer,
                            "emp_email_address" varchar,
                            "emp_title" varchar
);

CREATE TABLE "Member" (
                          "mem_id" serial PRIMARY KEY,
                          "mem_firstname" varchar,
                          "mem_lastname" varchar,
                          "mem_address_id" integer,
                          "mem_email_address" varchar,
                          "mem_reg_date" date,
                          "mem_lp_id" integer,
                          "mem_msl_id" integer
);

CREATE TABLE "MembershipLevel" (
                                   "msl_id" serial PRIMARY KEY,
                                   "msl_name" varchar,
                                   "msl_monthly_cost" float,
                                   "msl_red_hour" float,
                                   "msl_all_ps" integer
);

CREATE TABLE "LicensePlate" (
                                "lp_id" serial PRIMARY KEY,
                                "lp_number" varchar,
                                "lp_country" varchar
);

CREATE TABLE "Allocation" (
                              "all_id" serial PRIMARY KEY,
                              "all_mem_id" integer,
                              "all_pl_id" integer,
                              "all_start_hour" timestamp,
                              "all_end_hour" timestamp,
                              "all_status" varchar
);

CREATE TABLE "Invoice" (
                           "inv_id" serial PRIMARY KEY,
                           "inv_mem_id" integer,
                           "inv_creation_date" timestamp,
                           "inv_expiration_date" timestamp,
                           "inv_status" varchar,
                           "inv_date_of_payment" timestamp,
                           "inv_curr_memcost" float
);

CREATE TABLE "InvoiceItem" (
                               "invit_id" serial PRIMARY KEY,
                               "invit_all_id" integer,
                               "invit_inv_id" integer,
                               "invit_price" float
);

ALTER TABLE "Division" ADD FOREIGN KEY ("div_id") REFERENCES "Division" ("div_upper_div_id");

ALTER TABLE "Category" ADD FOREIGN KEY ("cat_id") REFERENCES "ParkingLot" ("pl_cat_id");

ALTER TABLE "Address" ADD FOREIGN KEY ("add_id") REFERENCES "ParkingLot" ("pl_address_id");

ALTER TABLE "Employee" ADD FOREIGN KEY ("emp_id") REFERENCES "ParkingLot" ("pl_contact_id");

ALTER TABLE "ParkingLot" ADD FOREIGN KEY ("pl_div_id") REFERENCES "Division" ("div_id");

ALTER TABLE "Member" ADD FOREIGN KEY ("mem_lp_id") REFERENCES "LicensePlate" ("lp_id");

ALTER TABLE "MembershipLevel" ADD FOREIGN KEY ("msl_id") REFERENCES "Member" ("mem_msl_id");

ALTER TABLE "Member" ADD FOREIGN KEY ("mem_id") REFERENCES "Allocation" ("all_mem_id");

ALTER TABLE "ParkingLot" ADD FOREIGN KEY ("pl_id") REFERENCES "Allocation" ("all_pl_id");

ALTER TABLE "InvoiceItem" ADD FOREIGN KEY ("invit_inv_id") REFERENCES "Invoice" ("inv_id");

ALTER TABLE "Allocation" ADD FOREIGN KEY ("all_id") REFERENCES "InvoiceItem" ("invit_all_id");
