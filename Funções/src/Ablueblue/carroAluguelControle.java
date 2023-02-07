package Ablueblue;

public class carroAluguelControle {
	
	@Autowired 
	private AluguelCarroService aluguelCarroService;
	
	@GetMapping(value = "/carros/{placa}")
    public ResponseEntity<Carro> getCarroByplaca(@PathVariable String placa){
    	
    	Carro Carro = CarroService.findCarroByPlaca(placa);
    	return new ResponseEntity<>(Carro, Carro == null  || Carro.isEmpty() ? HttpStatus.NO_CONTENT : HttpStatus.OK);
    }
    
	// receber as datas de entrada e saida(INOUT DO USUARIO), o que eu preciso enviar para o service 
	
    @PostMapping(value = "/{placa}/Carros")
    public <Carro> addCarro(@PathVariable String placaUser, @RequestBody Carro Carro){

    	<Carro> newPlaca = CarroService.createCarro(placaUser, Carro);
    	return new ResponseEntity<>(newPlaca, newPlaca == null  || newPlaca.isEmpty() ? HttpStatus.NO_CONTENT : HttpStatus.OK);
    
    	<Carro> newData = CarroService.createCarro(DataEntrada, Carro);
    	return new ResponseEntity<>(newData, neData == null  || newData.isEmpty() ? HttpStatus.NO_CONTENT : HttpStatus.OK);
    
    	<Carro> newData = CarroService.createCarro(DataSaida, Carro);
    	return new ResponseEntity<>(newData, neData == null  || newData.isEmpty() ? HttpStatus.NO_CONTENT : HttpStatus.OK);
    }
    
    }
}

}
