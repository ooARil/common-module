set search_path to schema_log;

CREATE TABLE IF NOT EXISTS debug
(
    uuid           varchar not null primary key,
    system_type_id varchar not null,
    method_params  text not null
);

CREATE TABLE IF NOT EXISTS exception
(
    uuid           varchar not null primary key,
    system_type_id varchar not null,
    method_params  text not null
);