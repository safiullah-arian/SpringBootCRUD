package services;

import org.springframework.stereotype.Service;

import entity.student;
import Repository.StudentRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class studentservices {

	@Autowired
	private  StudentRepository repository;
	public student savestudent(student student) {
	return	repository.save(student);
}


	public List<student> savestudent(List<student> student) {
		return	repository.saveAll(student);
	}
	
	public List<student> getstudent(){
		return repository.findAll();
	}
	
	public student getstudentById(int id){
		return repository.findById(id).orElse(null);
	}
	
	public student getstudentByName(String name){
		return repository.findByName(name);
	}
	
	public String deletestudent(int id) {
		repository.deleteById(id);
		return "student Removed !!" + id;
	}
	

	
	public student updateStudent(student student) {
	    student existingStudent = repository.findById(student.getId()).orElse(null);
	    existingStudent.setName(student.getName());
	    existingStudent.setClaass(student.getClaass());
	    existingStudent.setFee_enr(student.getFee_enr());
	    return repository.save(existingStudent);
	}


}

	
