/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     21.04.2014 22:13:23                          */
/*==============================================================*/


drop table if exists LOCO;

drop index RECORD_TIME on LOCO_DATA;

drop index RECORD_TIME_LOCO_INDEX on LOCO_DATA;

drop table if exists LOCO_DATA;

drop table if exists Sensor;

drop table if exists NODE;

/*==============================================================*/
/* Table: LOCO                                                  */
/*==============================================================*/
create table LOCO
(
   ID_LOCO              char(10) not null,
   TITLE_LOCO           varchar(512),
   primary key (ID_LOCO)
);

/*==============================================================*/
/* Table: LOCO_DATA                                             */
/*==============================================================*/
create table LOCO_DATA
(
   ID_LOCO_DATA         bigint unsigned not null auto_increment,
   ID_LOCO              char(10) not null,
   RECORD_TIME_LOCO_DATA timestamp not null,
   NAPR_ACCUM_BATR_SEC_A tinyint,
   NAPR_ACCUM_BATR_SEC_B tinyint,
   TOK_ACCUM_BATR_SEC_A tinyint,
   TOK_ACCUM_BATR_SEC_B tinyint,
   TOK_VOZ_TED_SEC_A    smallint,
   TOK_VOZ_TED_SEC_B    smallint,
   TOK_YAK_TED12_SEC_A  smallint,
   TOK_YAK_TED12_SEC_B  smallint,
   TOK_YAK_TED34_SEC_A  smallint,
   TOK_YAK_TED34_SEC_B  smallint,
   NAPR_CONT_SET_SEC_A  smallint,
   NAPR_CONT_SET_SEC_B  smallint,
   TEMPR_BUKS1_STOR_MASH_SEC_A tinyint,
   TEMPR_BUKS1_STOR_POM_MASH_SEC_A tinyint,
   TEMPR_BUKS2_STOR_MASH_SEC_A tinyint,
   TEMPR_BUKS2_STOR_POM_MASH_SEC_A tinyint,
   TEMPR_BUKS3_STOR_MASH_SEC_A tinyint,
   TEMPR_BUKS3_STOR_POM_MASH_SEC_A tinyint,
   TEMPR_BUKS4_STOR_MASH_SEC_A tinyint,
   TEMPR_BUKS4_STOR_POM_MASH_SEC_A tinyint,
   TEMPR_BUKS4_STOR_POM_MASH_SEC_B tinyint,
   TEMPR_BUKS4_STOR_MASH_SEC_B tinyint,
   TEMPR_BUKS3_STOR_POM_MASH_SEC_B tinyint,
   TEMPR_BUKS3_STOR_MASH_SEC_B tinyint,
   TEMPR_BUKS2_STOR_POM_MASH_SEC_B tinyint,
   TEMPR_BUKS2_STOR_MASH_SEC_B tinyint,
   TEMPR_BUKS1_STOR_POM_MASH_SEC_B tinyint,
   TEMPR_BUKS1_STOR_MASH_SEC_B tinyint,
   TEMPR_VHOD_TED_SEC_A1 tinyint,
   TEMPR_VHOD_TED_SEC_A2 tinyint,
   TEMPR_VHOD_TED_SEC_B1 tinyint,
   TEMPR_VHOD_TED_SEC_B2 tinyint,
   TEMPR_VIHOD_TED1_SEC_A tinyint,
   TEMPR_VIHOD_TED2_SEC_A tinyint,
   TEMPR_VIHOD_TED3_SEC_A tinyint,
   TEMPR_VIHOD_TED4_SEC_A tinyint,
   TEMPR_VIHOD_TED1_SEC_B tinyint,
   TEMPR_VIHOD_TED2_SEC_B tinyint,
   TEMPR_VIHOD_TED3_SEC_B tinyint,
   TEMPR_VIHOD_TED4_SEC_B tinyint,
   TEMPR_BPTR1_SEC_A    smallint,
   TEMPR_BPTR2_SEC_A    smallint,
   TEMPR_BPTR1_SEC_B    smallint,
   TEMPR_BPTR2_SEC_B    smallint,
   primary key (ID_LOCO_DATA)
);

/*==============================================================*/
/* Index: RECORD_TIME_LOCO_INDEX                                */
/*==============================================================*/
create unique index RECORD_TIME_LOCO_INDEX on LOCO_DATA
(
   RECORD_TIME_LOCO_DATA,
   ID_LOCO
);

/*==============================================================*/
/* Index: RECORD_TIME                                           */
/*==============================================================*/
create index RECORD_TIME on LOCO_DATA
(
   RECORD_TIME_LOCO_DATA
);

/*==============================================================*/
/* Table: Sensor                                                */
/*==============================================================*/
create table Sensor
(
   NAME                 char(50) not null,
   ID_NODE              int,
   DESCRIPTION          varchar(1024),
   UNIT_OF_MEASURE      varchar(10),
   primary key (NAME)
);

/*==============================================================*/
/* Table: NODE                                                  */
/*==============================================================*/
create table NODE
(
   ID_NODE              int not null,
   NAME_NODE            char(256),
   primary key (ID_NODE)
);

