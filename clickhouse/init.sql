CREATE TABLE account_table (
    guid String,
    userName String,
    password String,
    balancesIds Array(UInt64)
) ENGINE = MergeTree()
ORDER BY guid;


CREATE TABLE balance_table (
    guid String,
    currency Float64,
    accountId String
) ENGINE = MergeTree()
ORDER BY guid;

CREATE TABLE coin_table (
    guid String,
    name String
) ENGINE = MergeTree()
ORDER BY guid;

CREATE TABLE history_order_table (
    guid String,
    currency Float64,
    price Float64,
    orderOperation String,
    dateTime DateTime,
    orderState String,
    orderType String,
    accountId String
) ENGINE = MergeTree()
ORDER BY guid;

CREATE TABLE limit_order_table (
    guid String,
    coinFrom_guid String,
    coinFrom_name String,
    coinTo_guid String,
    coinTo_name String,
    currencyToWant Float64,
    priceToWant Float64,
    orderOperation String,
    dateTime DateTime,
    accountId String
) ENGINE = MergeTree()
ORDER BY guid;
