
create table LOCO
(
   ID_LOCO              char(10) not null,
   TITLE_LOCO           varchar(512),
   primary key (ID_LOCO)
);

create table LOCO_DATA
(
   ID_LOCO_DATA          int GENERATED BY DEFAULT AS IDENTITY (START WITH 1, INCREMENT BY 1) not null PRIMARY KEY,
   ID_LOCO               char(10) not null,
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
   TEMPR_BPTR2_SEC_B    smallint
);

create table SENSOR
(
   NAME                 char(50) not null,
   DESCRIPTION          varchar(1024),
   UNIT_OF_MEASURE      varchar(10),
   UNIT_NAME            varchar(10),
   primary key (NAME)
);

create table FILE_INFO
(
    FILE_NAME           varchar(50) not null,
    FILE_SIZE           smallint not null,
    LOADING_DATE        timestamp not null  
);

create table FILE_STRUCTURE_INFO
(
    ID                  INTEGER GENERATED BY DEFAULT AS IDENTITY (START WITH 1) NOT NULL PRIMARY KEY,
    RECORD_START_INDEX  smallint,
    RECORD_LENGTH       smallint,
    TYPE                varchar(10)
);

create table RECORD_STRUCTURE_INFO
(
    NAME                char(50) not null,
    INDEX               smallint,
    DELTA               numeric(9,6),
    FSI_TYPE            varchar(10),
    primary key (NAME)
);

create unique index RECORD_TIME_LOCO_INDEX on LOCO_DATA
(
   RECORD_TIME_LOCO_DATA,
   ID_LOCO
);

create index RECORD_TIME on LOCO_DATA
(
   RECORD_TIME_LOCO_DATA
);

create unique index FILE_INFO_INDEX on FILE_INFO
(
   FILE_NAME,
   FILE_SIZE
);

create table User
(
   LOGIN           char(20) not null,
   PASSWORD        char(32) not null,
   NAME            char(100) not null,
   ROLE            char(20) not null,
   primary key (LOGIN)
);
