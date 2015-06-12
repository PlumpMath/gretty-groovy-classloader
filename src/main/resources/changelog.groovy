databaseChangeLog {
    changeSet(id: '1', author: 'Author') {
        createTable(tableName: 'MyTable') {
            column(name: 'id', type: 'INT', autoIncrement: true) {
                constraints(primaryKey: true)
            }
            column(name: 'description', type: 'varchar(255)')
        }
    }
}
