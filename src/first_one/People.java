package first_one;


import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class People {
	public static void main(String[] args) {

			LocalDate start = LocalDate.parse("1996-01-01"),
			          end   = LocalDate.parse("2002-01-01");
			
			// vendas e' a lista que deve ser analizada
			List<Client> vendas = new ArrayList<Client>();
			
			// weekList e' um array com 7 valores, um para cada dia da semana
			int[] weekList = new int[7];
			// weekList e' um array com 12 valores, um para cada mes do ano
			int[] monthList = new int[12];

			
			// vamos preencher uma lista com clientes
			// a lista deve ter o um cliente para cada data e o numero de visitas deve ser populado aleatoriamente
			for (LocalDate date = start; date.isBefore(end); date = date.plusDays(1)) {
		        
				int visitas = (int)(Math.random() * 11);
				Client c = new Client();
				c.setData(date);
				c.setVisitas(visitas);
				
				vendas.add(c);
				
				}
			
			// vamos descobrir o dia da semana com mais visitas
			for (Client client : vendas) {
				
				if (client.getData().getDayOfWeek() == DayOfWeek.SUNDAY) {
					weekList[0] = weekList[0] + client.getVisitas();
	
			    } else if (client.getData().getDayOfWeek() == DayOfWeek.MONDAY) {
					weekList[1] = weekList[1] + client.getVisitas();
	
			    } else if (client.getData().getDayOfWeek() == DayOfWeek.TUESDAY) {
					weekList[2] = weekList[2] + client.getVisitas();
	
			    } else if (client.getData().getDayOfWeek() == DayOfWeek.WEDNESDAY) {
					weekList[3] = weekList[3] + client.getVisitas();
	
			    } else if (client.getData().getDayOfWeek() == DayOfWeek.THURSDAY) {
					weekList[4] = weekList[4] + client.getVisitas();
	
			    } else if (client.getData().getDayOfWeek() == DayOfWeek.FRIDAY) {
					weekList[5] = weekList[5] + client.getVisitas();
	
			    } else if (client.getData().getDayOfWeek() == DayOfWeek.SATURDAY) {
					weekList[6] = 0;
	
			    }
			
			}

			System.out.println(Arrays.toString(weekList));
			
			int melhor_dia_da_semana = 0;
			int day = 0;
			
			for (int i = 0; i < 7; i++) {
				if (weekList[i] > melhor_dia_da_semana) {
					melhor_dia_da_semana = weekList[i];
					day = i + 1;
				}
			}
			
			System.out.println(melhor_dia_da_semana + ", " + day);
			
			// vamos descobrir o mes do ano com mais visitas
			for (Client client : vendas) {
				
				if (client.getData().getMonth() == Month.JANUARY) {
					monthList[0] = monthList[0] + client.getVisitas();
	
			    } else if (client.getData().getMonth() == Month.FEBRUARY) {
			    	monthList[1] = monthList[1] + client.getVisitas();
	
			    } else if (client.getData().getMonth() == Month.MARCH) {
			    	monthList[2] = monthList[2] + client.getVisitas();
	
			    } else if (client.getData().getMonth() == Month.APRIL) {
			    	monthList[3] = monthList[3] + client.getVisitas();
	
			    } else if (client.getData().getMonth() == Month.MAY) {
			    	monthList[4] = monthList[4] + client.getVisitas();
	
			    } else if (client.getData().getMonth() == Month.JUNE) {
			    	monthList[5] = monthList[5] + client.getVisitas();
	
			    } else if (client.getData().getMonth() == Month.JULY) {
			    	monthList[6] = monthList[6] + client.getVisitas();
	
			    } else if (client.getData().getMonth() == Month.AUGUST) {
			    	monthList[7] = monthList[7] + client.getVisitas();
	
			    } else if (client.getData().getMonth() == Month.SEPTEMBER) {
			    	monthList[8] = monthList[8] + client.getVisitas();
	
			    } else if (client.getData().getMonth() == Month.OCTOBER) {
			    	monthList[9] = monthList[9] + client.getVisitas();
	
			    } else if (client.getData().getMonth() == Month.NOVEMBER) {
			    	monthList[10] = monthList[10] + client.getVisitas();
	
			    } else if (client.getData().getMonth() == Month.DECEMBER) {
			    	monthList[11] = monthList[11] + client.getVisitas();
	
			    }
			
			}

			System.out.println(Arrays.toString(monthList));
			
			int melhor_mes_do_ano = 0;
			int month = 0;
			
			for (int i = 0; i < 12; i++) {
				if (monthList[i] > melhor_mes_do_ano) {
					melhor_mes_do_ano = monthList[i];
					month = i + 1;
				}
			}
			System.out.println(melhor_mes_do_ano + ", " + month);
	}
}
