package com.example.firstprojectmysql;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller //indica que esta é uma classe Controller
@RequestMapping(path="/discipl") //indica que o caminho da API deve iniciar com /discipl
public class DisciplController {
@Autowired //indica que o Spring gera automaticamente o repositório para que possamos tratar os dados
private DisciplRepository disciplRepository;
@PostMapping(path="/add") //indica o EndPoint usado para adicionar um registro
public @ResponseBody String addDisciplina (
@RequestParam String name,@RequestParam String teacher,
@RequestParam LocalDate dateStart,
@RequestParam LocalDate dateEnd,
@RequestParam Integer hours,
Integer grade) {
//@ResponseBody indica que a Spring retornada será uma resposta
//@RequestParam indica os parâmetros que devem ser enviados obrigatoriamente (grade não é obrigatório)
Discipl d = new Discipl();
d.setName(name);
d.setTeacher(teacher);
d.setDateStart(dateStart);
d.setDateEnd(dateEnd);
d.setHours(hours);
d.setGrade(grade);
disciplRepository.save(d);
return "Disciplina Salva";
}
@GetMapping(path="/all")//indica o EndPoint para buscar e listar todos os registros
public @ResponseBody Iterable<Discipl> getAllDisciplines() {
//Aqui será retornado um JSON ou um XML com todas as disciplinas cadastradas
return disciplRepository.findAll();
}
}