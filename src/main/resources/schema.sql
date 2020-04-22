

-- ----------------------------------------------
-- DDL Statements for tables
-- ----------------------------------------------

CREATE TABLE "EVENTS" ("ID" INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1), "NAME" VARCHAR(255), "DATE" TIMESTAMP,"DESCRIPTION" VARCHAR(255), "LOCATION" VARCHAR(255), "REGISTRATIONLIMIT" INT);
CREATE TABLE "CUSTOMERS" ("ID" INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1), "NAME" VARCHAR(255), EMAIL VARCHAR(255));
-- ----------------------------------------------
-- DDL Statements for keys
-- ----------------------------------------------

-- primary/unique
ALTER TABLE "EVENTS" ADD CONSTRAINT "SQL120325130144010" PRIMARY KEY ("ID");
ALTER TABLE "CUSTOMERS" ADD CONSTRAINT "SQL120325130144011" PRIMARY KEY ("ID");

