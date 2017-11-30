/*
 * Axelor Business Solutions
 *
 * Copyright (C) 2017 Axelor (<http://axelor.com>).
 *
 * This program is free software: you can redistribute it and/or  modify
 * it under the terms of the GNU Affero General Public License, version 3,
 * as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
/**
 *
 */
package com.axelor.apps.supplychain.exception;

/**
 * @author axelor
 *
 */
public interface IExceptionMessage {
	/**
	 * Purchase order Invoice Service and controller
	 */

	static final String PO_INVOICE_1 = /*$$(*/ "Please, select a currency for the order %s" /*)*/;
	static final String PO_INVOICE_2 = /*$$(*/ "Invoice created" /*)*/;

	/**
	 * Purchase order Service
	 */
	static final String PURCHASE_ORDER_1 = /*$$(*/ "%s please configure a virtual supplier stock location for the company %s" /*)*/;
	static final String PURCHASE_ORDER_2 = /*$$(*/ "Error : you have exceeded the budget %s for this period" /*)*/;

	/**
	 * Sale order Invoice Service
	 */
	static final String SO_INVOICE_6 = /*$$(*/ "Please, select a currency for the order %s" /*)*/;
	static final String SO_INVOICE_NO_LINES_SELECTED = /*$$(*/ "There are no lines to invoice" /*)*/;
	static final String SO_INVOICE_QTY_MAX = /*$$(*/ "The quantity to invoice is greater than the quantity in the sale order" /*)*/;
	static final String SO_INVOICE_MISSING_INVOICING_PRODUCT = /*$$(*/ "Please configure the sale order invoicing product" /*)*/;
	static final String SO_INVOICE_MISSING_ADVANCE_PAYMENT_PRODUCT = /*$$(*/ "Please configure the advance payment product" /*)*/;
	static final String SO_INVOICE_MISSING_ADVANCE_PAYMENT_ACCOUNT = /*$$(*/ "You must configure an advance payment account for the company %s" /*)*/;
	static final String SO_INVOICE_TOO_MUCH_INVOICED = /*$$(*/ "The sale order %s invoiced amount cannot be greater than its total amount." /*)*/;


	/**
	 * Sale order Purchase Service
	 */
	static final String SO_PURCHASE_1 = /*$$(*/ "Please, select a supplier for the line %s" /*)*/;
	static final String SO_LINE_PURCHASE_AT_LEAST_ONE = /*$$(*/ "At least one sale order line must be selected" /*)*/;

	/**
	 * Stock Move Invoice Service
	 */
	static final String STOCK_MOVE_INVOICE_1 = /*$$(*/ "Incorrect product in the stock move %s" /*)*/;
	static final String STOCK_MOVE_MULTI_INVOICE_CURRENCY = /*$$(*/ "The currency is required and must be the same for all sale orders" /*)*/;
	static final String STOCK_MOVE_MULTI_INVOICE_CLIENT_PARTNER = /*$$(*/ "The client is required and must be the same for all sale orders" /*)*/;
	static final String STOCK_MOVE_MULTI_INVOICE_SUPPLIER_PARTNER = /*$$(*/ "The supplier is required and must be the same for all purchase orders" /*)*/;
	static final String STOCK_MOVE_MULTI_INVOICE_COMPANY_SO = /*$$(*/ "The company is required and must be the same for all sale orders" /*)*/;
	static final String STOCK_MOVE_MULTI_INVOICE_COMPANY_PO = /*$$(*/ "The company is required and must be the same for all purchase orders" /*)*/;
	static final String STOCK_MOVE_MULTI_INVOICE_IN_ATI = /*$$(*/ "Unit prices in A.T.I and in W.T. can't be mix" /*)*/;
	static final String STOCK_MOVE_NO_INVOICE_GENERATED = /*$$(*/ "No invoice was generated" /*)*/;
	static final String STOCK_MOVE_GENERATE_INVOICE = /*$$(*/ "The invoice for the stock move %s can't be generated because of this following error : %s" /*)*/;
	static final String OUTGOING_STOCK_MOVE_INVOICE_EXISTS = /*$$(*/ "An invoice not canceled already exists for the outgoing stock move %s" /*)*/;
	static final String INCOMING_STOCK_MOVE_INVOICE_EXISTS = /*$$(*/ "An invoice not canceled already exists for the incoming stock move %s" /*)*/;

	/**
	 * Batch Invoicing
	 */
	static final String BATCH_INVOICING_1 = /*$$(*/ "Subscription invoice generation report :" /*)*/;
	static final String BATCH_INVOICING_2 = /*$$(*/ "Order(s) processed" /*)*/;

	/**
	 * Batch Outgoing stock move invoicing
	 */
	String BATCH_OUTGOING_STOCK_MOVE_INVOICING_REPORT = /*$$(*/ "Outgoing stock move invoicing report:" /*)*/;
	String BATCH_OUTGOING_STOCK_MOVE_INVOICING_DONE_SINGULAR = /*$$(*/ "%d outgoing stock move processed successfully," /*)*/;
	String BATCH_OUTGOING_STOCK_MOVE_INVOICING_DONE_PLURAL = /*$$(*/ "%d outgoing stock moves processed successfully," /*)*/;

	/**
	 * Batch Order invoicing
	 */
	String BATCH_ORDER_INVOICING_REPORT = /*$$(*/ "Order invoicing report:" /*)*/;
	String BATCH_ORDER_INVOICING_DONE_SINGULAR = /*$$(*/ "%d order invoiced successfully," /*)*/;
	String BATCH_ORDER_INVOICING_DONE_PLURAL = /*$$(*/ "%d orders invoiced successfully," /*)*/;

	/**
	 * Mrp Line Service
	 */
	static final String MRP_LINE_1 = /*$$(*/ "No default supplier is defined for the product %s" /*)*/;
	static final String MRP_MISSING_MRP_LINE_TYPE = /*$$(*/ "No move type found for element : %s" /*)*/;
	static final String MRP_NO_PRODUCT = /*$$(*/ "Please select an element to run calculation" /*)*/;


	/**
	 * Sale order Stock Service Implement
	 */
	static final String SO_NO_DELIVERY_STOCK_MOVE_TO_GENERATE = /*$$(*/ "No delivery stock move to generate for this sale order" /*)*/;
	static final String SO_ACTIVE_DELIVERY_STOCK_MOVE_ALREADY_EXIST = /*$$(*/ "An active stock move already exists for the sale order %s" /*)*/;

	/**
	 * Timetable Controller
	 */
	static final String TIMETABLE_INVOICE_ALREADY_GENERATED = /*$$(*/ "The invoice has already been generated." /*)*/;

	/**
	 * Ventilate State Service
	 */
	String VENTILATE_STATE_MISSING_ADVANCE_ACCOUNT = /*$$(*/ "Please configure the advance payment account for the company %s" /*)*/;

	/**
	 * Stock Config
	 */
	String STOCK_CONFIG_SUPPLYCHAIN_RECEIPT = /*$$(*/ "You must configure a receipt location for company %s" /*)*/;
	String STOCK_CONFIG_SUPPLYCHAIN_PICKUP = /*$$(*/ "You must configure a pickup location for company %s." /*)*/;
}

