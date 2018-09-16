INSERT INTO mp_order_info(order_info_id, order_info_no, use_yn, order_info_type)
    VALUES(1, 1, false, 1);
INSERT INTO mp_order_info(order_info_id, order_info_no, use_yn, order_info_type)
    VALUES(2, 2, false, 1);
INSERT INTO mp_order_info(order_info_id, order_info_no, use_yn, order_info_type)
    VALUES(3, 3, false, 1);
INSERT INTO mp_order_info(order_info_id, order_info_no, use_yn, order_info_type)
    VALUES(4, 4, false, 1);
INSERT INTO mp_order_info(order_info_id, order_info_no, use_yn, order_info_type)
    VALUES(5, 5, false, 1);
INSERT INTO mp_order_info(order_info_id, order_info_no, use_yn, order_info_type)
    VALUES(6, 6, false, 1);
INSERT INTO mp_order_info(order_info_id, order_info_no, use_yn, order_info_type)
    VALUES(7, 7, false, 1);
INSERT INTO mp_order_info(order_info_id, order_info_no, use_yn, order_info_type)
    VALUES(8, 8, false, 1);

INSERT INTO mp_order_info(order_info_id, order_info_no, use_yn, order_info_type)
    VALUES(9, 1, false, 0);
INSERT INTO mp_order_info(order_info_id, order_info_no, use_yn, order_info_type)
    VALUES(10, 2, false, 0);
INSERT INTO mp_order_info(order_info_id, order_info_no, use_yn, order_info_type)
    VALUES(11, 3, false, 0);
INSERT INTO mp_order_info(order_info_id, order_info_no, use_yn, order_info_type)
    VALUES(12, 4, false, 0);
INSERT INTO mp_order_info(order_info_id, order_info_no, use_yn, order_info_type)
    VALUES(13, 5, false, 0);
INSERT INTO mp_order_info(order_info_id, order_info_no, use_yn, order_info_type)
    VALUES(14, 6, false, 0);
INSERT INTO mp_order_info(order_info_id, order_info_no, use_yn, order_info_type)
    VALUES(15, 7, false, 0);
INSERT INTO mp_order_info(order_info_id, order_info_no, use_yn, order_info_type)
    VALUES(16, 8, false, 0);
INSERT INTO mp_order_info(order_info_id, order_info_no, use_yn, order_info_type)
    VALUES(17, 9, false, 0);
INSERT INTO mp_order_info(order_info_id, order_info_no, use_yn, order_info_type)
    VALUES(18, 10, false, 0);
INSERT INTO mp_order_info(order_info_id, order_info_no, use_yn, order_info_type)
    VALUES(19, 11, false, 0);
INSERT INTO mp_order_info(order_info_id, order_info_no, use_yn, order_info_type)
    VALUES(20, 12, false, 0);
INSERT INTO mp_order_info(order_info_id, order_info_no, use_yn, order_info_type)
    VALUES(21, 13, false, 0);
INSERT INTO mp_order_info(order_info_id, order_info_no, use_yn, order_info_type)
    VALUES(22, 14, false, 0);
INSERT INTO mp_order_info(order_info_id, order_info_no, use_yn, order_info_type)
    VALUES(23, 15, false, 0);
INSERT INTO mp_order_info(order_info_id, order_info_no, use_yn, order_info_type)
    VALUES(24, 16, false, 0);
INSERT INTO mp_order_info(order_info_id, order_info_no, use_yn, order_info_type)
    VALUES(25, 17, false, 0);
INSERT INTO mp_order_info(order_info_id, order_info_no, use_yn, order_info_type)
    VALUES(26, 18, false, 0);
INSERT INTO mp_order_info(order_info_id, order_info_no, use_yn, order_info_type)
    VALUES(27, 19, false, 0);
INSERT INTO mp_order_info(order_info_id, order_info_no, use_yn, order_info_type)
    VALUES(28, 20, false, 0);


INSERT INTO mp_product_group(product_group_id, product_group_name) VALUES (1, '안주류');
INSERT INTO mp_product_group(product_group_id, product_group_name) VALUES (2, '음료');
INSERT INTO mp_product_group(product_group_id, product_group_name) VALUES (3, '세트메뉴');
INSERT INTO mp_product_group(product_group_id, product_group_name) VALUES (4, '이벤트메뉴');

INSERT INTO mp_product(product_id, origin_amount, product_name, sales_amount, product_auto_cooking_complete_yn, soldout_yn, product_group_id) values ( '1', '0', '김치전','6000', FALSE, false, '1');
INSERT INTO mp_product(product_id, origin_amount, product_name, sales_amount, product_auto_cooking_complete_yn, soldout_yn, product_group_id) values ( '2', '0', '파전','6000', FALSE, false, '1');
INSERT INTO mp_product(product_id, origin_amount, product_name, sales_amount, product_auto_cooking_complete_yn, soldout_yn, product_group_id) values ( '3', '0', '소떡소떡','3000', FALSE, false, '1');
INSERT INTO mp_product(product_id, origin_amount, product_name, sales_amount, product_auto_cooking_complete_yn, soldout_yn, product_group_id) values ( '4', '0', '간지스크램블','3000', FALSE, false, '1');
INSERT INTO mp_product(product_id, origin_amount, product_name, sales_amount, product_auto_cooking_complete_yn, soldout_yn, product_group_id) values ( '5', '0', '나쵸+치즈소스','3000', FALSE, false, '1');
INSERT INTO mp_product(product_id, origin_amount, product_name, sales_amount, product_auto_cooking_complete_yn, soldout_yn, product_group_id) values ( '6', '0', '컵라면','2000', TRUE, false, '1');
INSERT INTO mp_product(product_id, origin_amount, product_name, sales_amount, product_auto_cooking_complete_yn, soldout_yn, product_group_id) values ( '7', '0', '떡꼬치','1500', FALSE, false, '1');
INSERT INTO mp_product(product_id, origin_amount, product_name, sales_amount, product_auto_cooking_complete_yn, soldout_yn, product_group_id) values ( '8', '0', '후랑크소시지','2500', FALSE, false, '1');

INSERT INTO mp_product(product_id, origin_amount, product_name, sales_amount, product_auto_cooking_complete_yn, soldout_yn, product_group_id) values ( '9', '0', '코카콜라','2000', TRUE, false, '2');
INSERT INTO mp_product(product_id, origin_amount, product_name, sales_amount, product_auto_cooking_complete_yn, soldout_yn, product_group_id) values ( '10', '0', '사이다','2000', TRUE, false, '2');
INSERT INTO mp_product(product_id, origin_amount, product_name, sales_amount, product_auto_cooking_complete_yn, soldout_yn, product_group_id) values ( '11', '0', '모히또','3000', TRUE, false, '2');
INSERT INTO mp_product(product_id, origin_amount, product_name, sales_amount, product_auto_cooking_complete_yn, soldout_yn, product_group_id) values ( '12', '0', '블루하와이안','3000', TRUE, false, '2');
INSERT INTO mp_product(product_id, origin_amount, product_name, sales_amount, product_auto_cooking_complete_yn, soldout_yn, product_group_id) values ( '13', '0', '샤인온더비치','3000', TRUE, false, '2');

INSERT INTO mp_product(product_id, origin_amount, product_name, sales_amount, product_auto_cooking_complete_yn, soldout_yn, product_group_id) values ( '14', '0', '떡꼬치+후랑크소시지','3500', FALSE, false, '3');
INSERT INTO mp_product(product_id, origin_amount, product_name, sales_amount, product_auto_cooking_complete_yn, soldout_yn, product_group_id) values ( '15', '0', '김치전/파전(택1)+육개장','7500', FALSE, false, '3');

INSERT INTO mp_product(product_id, origin_amount, product_name, sales_amount, product_auto_cooking_complete_yn, soldout_yn, product_group_id) values ( '16', '0', '칵테일 3잔','8000', TRUE, false, '4');
INSERT INTO mp_product(product_id, origin_amount, product_name, sales_amount, product_auto_cooking_complete_yn, soldout_yn, product_group_id) values ( '17', '0', '김치전+탄산음료 1잔','7500', FALSE, false, '4');
INSERT INTO mp_product(product_id, origin_amount, product_name, sales_amount, product_auto_cooking_complete_yn, soldout_yn, product_group_id) values ( '18', '0', '파전+탄산음료 1잔','7500', FALSE, false, '4');
INSERT INTO mp_product(product_id, origin_amount, product_name, sales_amount, product_auto_cooking_complete_yn, soldout_yn, product_group_id) values ( '19', '0', '[쿠폰]나쵸','0', TRUE, false, '4');