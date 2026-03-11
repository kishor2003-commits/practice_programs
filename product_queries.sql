/* =====================================================
   PRODUCT DATABASE SQL QUERIES
   ===================================================== */


/* -----------------------------------------------------
   1. Update price of products in Electronics category
   (Apply 15% discount and round to 2 decimals)
   ----------------------------------------------------- */

UPDATE products AS p
INNER JOIN categories AS c
    ON p.category_id = c.category_id
SET p.price = ROUND(p.price * 0.85, 2)
WHERE c.category_name = 'Electronics';



/* -----------------------------------------------------
   2. Find MAX and MIN price in Electronics category
   ----------------------------------------------------- */

SELECT
    MAX(p.price) AS max_price,
    MIN(p.price) AS min_price
FROM products AS p
INNER JOIN categories AS c
    ON p.category_id = c.category_id
WHERE c.category_name = 'Electronics';



/* -----------------------------------------------------
   3. Find average price of all products
   ----------------------------------------------------- */

SELECT AVG(price) AS average_price
FROM products;



/* -----------------------------------------------------
   4. Display product details with category and supplier
   ----------------------------------------------------- */

SELECT
    p.product_id,
    p.product_name,
    c.category_name,
    s.supplier_name
FROM products AS p
INNER JOIN categories AS c
    ON p.category_id = c.category_id
INNER JOIN suppliers AS s
    ON p.supplier_id = s.supplier_id
ORDER BY p.product_id;



/* -----------------------------------------------------
   5. Count total number of products
   ----------------------------------------------------- */

SELECT COUNT(*) AS total_products
FROM products;



/* -----------------------------------------------------
   6. Find products where stock quantity is below 5
   ----------------------------------------------------- */

SELECT *
FROM products
WHERE stock_quantity < 5;
