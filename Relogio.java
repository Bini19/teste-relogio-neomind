import java.util.Calendar;

 public class Relogio {
	
	private int receberPosicaoPonteiroHoras(int hora, int minuto){
		if (hora == 12)
        hora = 0;
    if (minuto == 60) 
        minuto = 0;
        
		return (int)(0.5 * (hora*60 + minuto));
	}
	
	private int receberPosicaoPonteiroMinutos(long minuto){
		if (minuto == 60) 
      minuto = 0;
		return (int)minuto*6;
	}

	public long retornaAnguloRelogio(Calendar horario){
		int posicaoPonteiroHora = receberPosicaoPonteiroHoras(horario.get(Calendar.HOUR_OF_DAY) , horario.get(Calendar.MINUTE));
		int posicaoPonteiroMinuto = receberPosicaoPonteiroMinutos(horario.get(Calendar.MINUTE));
		
      int angulo = Math.abs(posicaoPonteiroHora - posicaoPonteiroMinuto);
 
      angulo = Math.min(360-angulo, angulo);
		return angulo;
	} 

}
