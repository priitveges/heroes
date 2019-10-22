CREATE TABLE hero
(
    id             bigserial PRIMARY KEY,
    name           varchar  NOT NULL,
    strength       bigint  NULL default 0,
    stamina        bigint  NULL default 0
);
