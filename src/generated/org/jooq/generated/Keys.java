/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated;


import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.generated.tables.JItem;
import org.jooq.generated.tables.JMember;
import org.jooq.generated.tables.JOrders;
import org.jooq.generated.tables.records.ItemRecord;
import org.jooq.generated.tables.records.MemberRecord;
import org.jooq.generated.tables.records.OrdersRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables in
 * jooq_study.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<ItemRecord> KEY_ITEM_PRIMARY = Internal.createUniqueKey(JItem.ITEM, DSL.name("KEY_item_PRIMARY"), new TableField[] { JItem.ITEM.ITEM_ID }, true);
    public static final UniqueKey<MemberRecord> KEY_MEMBER_PRIMARY = Internal.createUniqueKey(JMember.MEMBER, DSL.name("KEY_member_PRIMARY"), new TableField[] { JMember.MEMBER.MEMBER_ID }, true);
    public static final UniqueKey<OrdersRecord> KEY_ORDERS_PRIMARY = Internal.createUniqueKey(JOrders.ORDERS, DSL.name("KEY_orders_PRIMARY"), new TableField[] { JOrders.ORDERS.ORDER_ID }, true);
}
