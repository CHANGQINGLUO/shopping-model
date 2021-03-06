package com.shopping;

// Generated Jan 6, 2016 3:15:55 PM by Hibernate Tools 4.3.1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * Order generated by hbm2java
 */
@Entity
@Table(name = "order", catalog = "shdb", uniqueConstraints = @UniqueConstraint(columnNames = "order_code"))
public class Order implements java.io.Serializable {

	private String id;
	private User userByMerchantUserId;
	private User userByConsumerUserId;
	private String orderCode;
	private String status;
	private String shippingAddr;
	private String billingAddr;
	private String lastUpdateBy;
	private Date lastUpdateTime;
	private String versionstamp;
	private Set<OrderDetail> orderDetails = new HashSet<OrderDetail>(0);

	public Order() {
	}

	public Order(String id, String orderCode, String status) {
		this.id = id;
		this.orderCode = orderCode;
		this.status = status;
	}

	public Order(String id, User userByMerchantUserId,
			User userByConsumerUserId, String orderCode, String status,
			String shippingAddr, String billingAddr, String lastUpdateBy,
			Date lastUpdateTime, String versionstamp,
			Set<OrderDetail> orderDetails) {
		this.id = id;
		this.userByMerchantUserId = userByMerchantUserId;
		this.userByConsumerUserId = userByConsumerUserId;
		this.orderCode = orderCode;
		this.status = status;
		this.shippingAddr = shippingAddr;
		this.billingAddr = billingAddr;
		this.lastUpdateBy = lastUpdateBy;
		this.lastUpdateTime = lastUpdateTime;
		this.versionstamp = versionstamp;
		this.orderDetails = orderDetails;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false, length = 100)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "merchant_user_id")
	public User getUserByMerchantUserId() {
		return this.userByMerchantUserId;
	}

	public void setUserByMerchantUserId(User userByMerchantUserId) {
		this.userByMerchantUserId = userByMerchantUserId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "consumer_user_id")
	public User getUserByConsumerUserId() {
		return this.userByConsumerUserId;
	}

	public void setUserByConsumerUserId(User userByConsumerUserId) {
		this.userByConsumerUserId = userByConsumerUserId;
	}

	@Column(name = "order_code", unique = true, nullable = false, length = 40)
	public String getOrderCode() {
		return this.orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	@Column(name = "status", nullable = false, length = 1)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "shipping_addr", length = 100)
	public String getShippingAddr() {
		return this.shippingAddr;
	}

	public void setShippingAddr(String shippingAddr) {
		this.shippingAddr = shippingAddr;
	}

	@Column(name = "billing_addr", length = 100)
	public String getBillingAddr() {
		return this.billingAddr;
	}

	public void setBillingAddr(String billingAddr) {
		this.billingAddr = billingAddr;
	}

	@Column(name = "last_update_by", length = 30)
	public String getLastUpdateBy() {
		return this.lastUpdateBy;
	}

	public void setLastUpdateBy(String lastUpdateBy) {
		this.lastUpdateBy = lastUpdateBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "last_update_time", length = 19)
	public Date getLastUpdateTime() {
		return this.lastUpdateTime;
	}

	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	@Column(name = "versionstamp", length = 45)
	public String getVersionstamp() {
		return this.versionstamp;
	}

	public void setVersionstamp(String versionstamp) {
		this.versionstamp = versionstamp;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "order")
	public Set<OrderDetail> getOrderDetails() {
		return this.orderDetails;
	}

	public void setOrderDetails(Set<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}

}
