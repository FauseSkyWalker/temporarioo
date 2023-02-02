package Ablueblue;

public class carroAluguelControle {
	
	@Autowired 
	private AluguelCarroService aluguelCarroService;
	
	@GetMapping(value = "/carros/placa")
    public ResponseEntity<Optional<Carro>> getCarroByplaca(@PathVariable Long placa){
    	
    	Optional<Carro> Carro = CarroService.findAtivplacaadeByplaca(placa);
    	return new ResponseEntity<>(Carro, Carro == null  || Carro.isEmpty() ? HttpStatus.NO_CONTENT : HttpStatus.OK);
    }
    
	
    @PostMapping(value = "/{placaUser}/Carros")
    public ResponseEntity<Optional<Carro>> addCarro(@PathVariable Long placaUser, @RequestBody Carro Carro){

    	Optional<Carro> newAtivplacaade = CarroService.createCarro(placaUser, Carro);
    	return new ResponseEntity<>(newAtivplacaade, newAtivplacaade == null  || newAtivplacaade.isEmpty() ? HttpStatus.NO_CONTENT : HttpStatus.OK);
    }
    
    @PutMapping(value = "/Carro/{placa}")
    public ResponseEntity<Carro> updateCarro(@RequestBody CarroDTO CarroDTO, @PathVariable Long placa){

        return new ResponseEntity<>(CarroService.updateAtivplacaade(CarroDTO, placa), HttpStatus.OK);
    }
    
  
    @DeleteMapping(value = "/Carros/delete/{placa}")
    public ResponseEntity<List<Carro>> deleteCarroByplaca(@PathVariable Long placa){

    	CarroService.deleteCarroByplaca(placa);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

}
