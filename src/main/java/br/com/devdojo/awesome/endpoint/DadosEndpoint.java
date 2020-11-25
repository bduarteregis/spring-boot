package br.com.devdojo.awesome.endpoint;

import br.com.devdojo.awesome.model.Dados;
import br.com.devdojo.awesome.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.plaf.basic.BasicListUI;
import java.time.LocalDateTime;
import java.util.List;

import static java.util.Arrays.asList;

@RestController
@RequestMapping("dados")
public class DadosEndpoint {
    @Autowired
    private DateUtil dateUtil;
    @RequestMapping(method = RequestMethod.GET, path = "/list")
    public List<Dados> listAll(){
        System.out.println("---------- Registro de Acesso");
        System.out.println("---------- Horário: " + dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        return asList(new Dados("Samsung"), new Dados("Apple"));
    }
}
