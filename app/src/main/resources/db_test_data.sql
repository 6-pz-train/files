INSERT INTO LOCO (ID_LOCO, TITLE_LOCO) VALUES ('L001dp','Локомотив 1 Днепропетровск');
INSERT INTO LOCO (ID_LOCO, TITLE_LOCO) VALUES ('L002dp','Локомотив 2 Днепропетровск');
INSERT INTO LOCO (ID_LOCO, TITLE_LOCO) VALUES ('L001kv','Локомотив 1 Киев');
INSERT INTO LOCO (ID_LOCO, TITLE_LOCO) VALUES ('L003lv','Локомотив 1 Львов');
INSERT INTO LOCO (ID_LOCO, TITLE_LOCO) VALUES ('L001zp','Локомотив 1 Запорожье');

INSERT INTO SENSOR (NAME, DESCRIPTION, UNIT_OF_MEASURE, UNIT_NAME) VALUES ('NAPR_ACCUM_BATR_SEC_A','Напр. аккумул. батареи секции А', 'U', 'BUKS');
INSERT INTO SENSOR (NAME, DESCRIPTION, UNIT_OF_MEASURE, UNIT_NAME) VALUES ('NAPR_ACCUM_BATR_SEC_B','Напр. аккумул. батареи секции Б', 'U', 'BUKS');
INSERT INTO SENSOR (NAME, DESCRIPTION, UNIT_OF_MEASURE, UNIT_NAME) VALUES ('TOK_ACCUM_BATR_SEC_A','Ток аккумул. батареи секции А', 'I', 'BUKS');
INSERT INTO SENSOR (NAME, DESCRIPTION, UNIT_OF_MEASURE, UNIT_NAME) VALUES ('TOK_ACCUM_BATR_SEC_B','Ток аккумул. батареи секции Б', 'I', 'BUKS');
INSERT INTO SENSOR (NAME, DESCRIPTION, UNIT_OF_MEASURE, UNIT_NAME) VALUES ('TOK_VOZ_TED_SEC_A','Ток возбуждения ТЭД секции А', 'І', 'BUKS');
INSERT INTO SENSOR (NAME, DESCRIPTION, UNIT_OF_MEASURE, UNIT_NAME) VALUES ('TOK_VOZ_TED_SEC_B','Ток возбуждения ТЭД секции Б', 'І', 'BUKS');

INSERT INTO LOCO_DATA (ID_LOCO_DATA, ID_LOCO, RECORD_TIME_LOCO_DATA, NAPR_ACCUM_BATR_SEC_A,
                       NAPR_ACCUM_BATR_SEC_B, TOK_ACCUM_BATR_SEC_A, TOK_ACCUM_BATR_SEC_B,
                       TOK_VOZ_TED_SEC_A, TOK_VOZ_TED_SEC_B, TOK_YAK_TED12_SEC_A,
                       TOK_YAK_TED12_SEC_B, TOK_YAK_TED34_SEC_A, TOK_YAK_TED34_SEC_B,
                       NAPR_CONT_SET_SEC_A, NAPR_CONT_SET_SEC_B, TEMPR_BUKS1_STOR_MASH_SEC_A,
                       TEMPR_BUKS1_STOR_POM_MASH_SEC_A, TEMPR_BUKS2_STOR_MASH_SEC_A, TEMPR_BUKS2_STOR_POM_MASH_SEC_A,
                       TEMPR_BUKS3_STOR_MASH_SEC_A, TEMPR_BUKS3_STOR_POM_MASH_SEC_A, TEMPR_BUKS4_STOR_MASH_SEC_A,
                       TEMPR_BUKS4_STOR_POM_MASH_SEC_A, TEMPR_BUKS4_STOR_POM_MASH_SEC_B, TEMPR_BUKS4_STOR_MASH_SEC_B,
                       TEMPR_BUKS3_STOR_POM_MASH_SEC_B, TEMPR_BUKS3_STOR_MASH_SEC_B, TEMPR_BUKS2_STOR_POM_MASH_SEC_B,
                       TEMPR_BUKS2_STOR_MASH_SEC_B, TEMPR_BUKS1_STOR_POM_MASH_SEC_B, TEMPR_BUKS1_STOR_MASH_SEC_B,
                       TEMPR_VHOD_TED_SEC_A1, TEMPR_VHOD_TED_SEC_A2, TEMPR_VHOD_TED_SEC_B1, TEMPR_VHOD_TED_SEC_B2,
                       TEMPR_VIHOD_TED1_SEC_A, TEMPR_VIHOD_TED2_SEC_A, TEMPR_VIHOD_TED3_SEC_A, TEMPR_VIHOD_TED4_SEC_A,
                       TEMPR_VIHOD_TED1_SEC_B, TEMPR_VIHOD_TED2_SEC_B, TEMPR_VIHOD_TED3_SEC_B, TEMPR_VIHOD_TED4_SEC_B,
                       TEMPR_BPTR1_SEC_A, TEMPR_BPTR2_SEC_A, TEMPR_BPTR1_SEC_B, TEMPR_BPTR2_SEC_B)
VALUES (0,'L001dp','2014-01-01 22:10:00.001',13,14,15,16,17,18,19,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46);
INSERT INTO LOCO_DATA (ID_LOCO_DATA, ID_LOCO, RECORD_TIME_LOCO_DATA, NAPR_ACCUM_BATR_SEC_A,
                       NAPR_ACCUM_BATR_SEC_B, TOK_ACCUM_BATR_SEC_A, TOK_ACCUM_BATR_SEC_B,
                       TOK_VOZ_TED_SEC_A, TOK_VOZ_TED_SEC_B, TOK_YAK_TED12_SEC_A,
                       TOK_YAK_TED12_SEC_B, TOK_YAK_TED34_SEC_A, TOK_YAK_TED34_SEC_B,
                       NAPR_CONT_SET_SEC_A, NAPR_CONT_SET_SEC_B, TEMPR_BUKS1_STOR_MASH_SEC_A,
                       TEMPR_BUKS1_STOR_POM_MASH_SEC_A, TEMPR_BUKS2_STOR_MASH_SEC_A, TEMPR_BUKS2_STOR_POM_MASH_SEC_A,
                       TEMPR_BUKS3_STOR_MASH_SEC_A, TEMPR_BUKS3_STOR_POM_MASH_SEC_A, TEMPR_BUKS4_STOR_MASH_SEC_A,
                       TEMPR_BUKS4_STOR_POM_MASH_SEC_A, TEMPR_BUKS4_STOR_POM_MASH_SEC_B, TEMPR_BUKS4_STOR_MASH_SEC_B,
                       TEMPR_BUKS3_STOR_POM_MASH_SEC_B, TEMPR_BUKS3_STOR_MASH_SEC_B, TEMPR_BUKS2_STOR_POM_MASH_SEC_B,
                       TEMPR_BUKS2_STOR_MASH_SEC_B, TEMPR_BUKS1_STOR_POM_MASH_SEC_B, TEMPR_BUKS1_STOR_MASH_SEC_B,
                       TEMPR_VHOD_TED_SEC_A1, TEMPR_VHOD_TED_SEC_A2, TEMPR_VHOD_TED_SEC_B1, TEMPR_VHOD_TED_SEC_B2,
                       TEMPR_VIHOD_TED1_SEC_A, TEMPR_VIHOD_TED2_SEC_A, TEMPR_VIHOD_TED3_SEC_A, TEMPR_VIHOD_TED4_SEC_A,
                       TEMPR_VIHOD_TED1_SEC_B, TEMPR_VIHOD_TED2_SEC_B, TEMPR_VIHOD_TED3_SEC_B, TEMPR_VIHOD_TED4_SEC_B,
                       TEMPR_BPTR1_SEC_A, TEMPR_BPTR2_SEC_A, TEMPR_BPTR1_SEC_B, TEMPR_BPTR2_SEC_B)
VALUES (1,'L001dp','2014-04-01 14:10:20.031',23,24,25,26,27,28,29,20,21,22,23,24,25,26,27,28,29,22,22,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46);
INSERT INTO LOCO_DATA (ID_LOCO_DATA, ID_LOCO, RECORD_TIME_LOCO_DATA, NAPR_ACCUM_BATR_SEC_A,
                       NAPR_ACCUM_BATR_SEC_B, TOK_ACCUM_BATR_SEC_A, TOK_ACCUM_BATR_SEC_B,
                       TOK_VOZ_TED_SEC_A, TOK_VOZ_TED_SEC_B, TOK_YAK_TED12_SEC_A,
                       TOK_YAK_TED12_SEC_B, TOK_YAK_TED34_SEC_A, TOK_YAK_TED34_SEC_B,
                       NAPR_CONT_SET_SEC_A, NAPR_CONT_SET_SEC_B, TEMPR_BUKS1_STOR_MASH_SEC_A,
                       TEMPR_BUKS1_STOR_POM_MASH_SEC_A, TEMPR_BUKS2_STOR_MASH_SEC_A, TEMPR_BUKS2_STOR_POM_MASH_SEC_A,
                       TEMPR_BUKS3_STOR_MASH_SEC_A, TEMPR_BUKS3_STOR_POM_MASH_SEC_A, TEMPR_BUKS4_STOR_MASH_SEC_A,
                       TEMPR_BUKS4_STOR_POM_MASH_SEC_A, TEMPR_BUKS4_STOR_POM_MASH_SEC_B, TEMPR_BUKS4_STOR_MASH_SEC_B,
                       TEMPR_BUKS3_STOR_POM_MASH_SEC_B, TEMPR_BUKS3_STOR_MASH_SEC_B, TEMPR_BUKS2_STOR_POM_MASH_SEC_B,
                       TEMPR_BUKS2_STOR_MASH_SEC_B, TEMPR_BUKS1_STOR_POM_MASH_SEC_B, TEMPR_BUKS1_STOR_MASH_SEC_B,
                       TEMPR_VHOD_TED_SEC_A1, TEMPR_VHOD_TED_SEC_A2, TEMPR_VHOD_TED_SEC_B1, TEMPR_VHOD_TED_SEC_B2,
                       TEMPR_VIHOD_TED1_SEC_A, TEMPR_VIHOD_TED2_SEC_A, TEMPR_VIHOD_TED3_SEC_A, TEMPR_VIHOD_TED4_SEC_A,
                       TEMPR_VIHOD_TED1_SEC_B, TEMPR_VIHOD_TED2_SEC_B, TEMPR_VIHOD_TED3_SEC_B, TEMPR_VIHOD_TED4_SEC_B,
                       TEMPR_BPTR1_SEC_A, TEMPR_BPTR2_SEC_A, TEMPR_BPTR1_SEC_B, TEMPR_BPTR2_SEC_B)
VALUES (2,'L001dp','2014-06-01 14:10:20.031',33,34,35,36,37,38,39,30,31,32,33,34,35,36,37,38,39,32,32,32,33,34,35,36,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46);