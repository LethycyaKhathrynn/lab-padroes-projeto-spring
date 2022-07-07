package one.digitalinnovation.gof.service;

import org.springframework.cloud.openfeign.FeignClient;


@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepService {

    @RequestMapping(method = RequestMethod.GET, value = "/{cep}/json/")
    Endereco consultarCep(@PathVariable("Cep") String cep);
}