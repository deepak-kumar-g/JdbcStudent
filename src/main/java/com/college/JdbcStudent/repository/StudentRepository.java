package com.college.JdbcStudent.repository;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import com.college.JdbcStudent.model.Student;


@Repository
public class StudentRepository {
	
	@Autowired
	private JdbcTemplate JdbcTem;

	
	//INSERT
	public int insertStudent(Student Student) {
		String sql = "insert into student (name, marks, grade, city) values (?, ?, ?, ?)";
		return JdbcTem.update(sql, Student.getName(), Student.getMarks(), Student.getGrade(), Student.getCity());
	}
    
	//UPDATE
	public int updateStudent(Student Student) {
		String sql = "update student set name = ?, marks = ?, grade = ?, city = ? where id = ?";
		return JdbcTem.update(sql, Student.getName(), Student.getMarks(), Student.getGrade(), Student.getCity(), Student.getId());
	}
	
	//DELETE
	public int deleteStudent(Integer id) {
		String sql = "delete from student where id = ?";
		return JdbcTem.update(sql, id);
	}

}
