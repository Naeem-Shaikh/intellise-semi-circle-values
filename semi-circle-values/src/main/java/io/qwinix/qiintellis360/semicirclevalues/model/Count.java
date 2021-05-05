package io.qwinix.qiintellis360.semicirclevalues.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="index_page")
public class Count {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String title;
	@Column(name="numbers")
	private double number;
	private double total;
	@Transient
	private int percent;

	public Count() {
		
	}

	public Count(int id, String title, double number, double total) {
	
		this.id = id;
		this.title = title;
		this.number = number;
		this.total = total;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getNumber() {
		return number;
	}

	public void setNumber(double number) {
		this.number = number;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Count [id=" + id + ", title=" + title + ", number=" + number + ", total=" + total + "]";
	}

}
