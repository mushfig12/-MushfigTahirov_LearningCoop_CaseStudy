package org.mushfigtahirov.learningcoop.models;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
// This class is a model class that creates course table in database
@Entity
@Table(name="course")
public class Course {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY) 
	private Integer id;
	private String courseName;
	private String instructorName;
	private String courseDescription;

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course( String courseName, String instructorName, String courseDescription) {
		super();
		this.courseName = courseName;
		this.instructorName = instructorName;
		this.courseDescription = courseDescription;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getInstructorName() {
		return instructorName;
	}

	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}

	public String getCourseDescription() {
		return courseDescription;
	}

	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((courseDescription == null) ? 0 : courseDescription.hashCode());
		result = prime * result + ((courseName == null) ? 0 : courseName.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((instructorName == null) ? 0 : instructorName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		if (courseDescription == null) {
			if (other.courseDescription != null)
				return false;
		} else if (!courseDescription.equals(other.courseDescription))
			return false;
		if (courseName == null) {
			if (other.courseName != null)
				return false;
		} else if (!courseName.equals(other.courseName))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (instructorName == null) {
			if (other.instructorName != null)
				return false;
		} else if (!instructorName.equals(other.instructorName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", courseName=" + courseName + ", instructorName=" + instructorName
				+ ", courseDescription=" + courseDescription + "]";
	}

	

}

