/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06_metodos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author felipex
 */
public class Exercicio03_BuscaData { 
    
    public static String getDia(String data){
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setLenient(false);
		try {
			sdf.parse(data);
			
			String dataHoje = sdf.format(Calendar.getInstance().getTime());
			if (data.equals(dataHoje)) {
				return "easter egg - Jornada nas galáxias!";
			} else {
				String receb = data.replace(data.substring(3, 5), mes(data.substring(3, 5)));
				return receb;
			}
		}catch (ParseException e) {
			return "0";
		}
    }

	public static String getMes(String data) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setLenient(false);
		try {
			sdf.parse(data);
			
			String dataHoje = sdf.format(Calendar.getInstance().getTime());
			if (data.equals(dataHoje)) {
				return "easter egg - Jornada nas galáxias!";
			} else {
				String receb = data.replace(data.substring(3, 5), mes(data.substring(3, 5)));
				return receb;
			}
		}catch (ParseException e) {
			return "0";
		}
	}

	public static String getAno(String data) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setLenient(false);
		try {
			sdf.parse(data);
			
			String dataHoje = sdf.format(Calendar.getInstance().getTime());
			if (data.equals(dataHoje)) {
				return "easter egg - Jornada nas galáxias!";
			} else {
				String receb = data.replace(data.substring(3, 5), mes(data.substring(3, 5)));
				return receb;
			}
		}catch (ParseException e) {
			return "0";
		}	
        }

	public static String mes(String mes) {
		String mesExtenso;
		switch (mes) {
		case "01":
			mesExtenso = "Janeiro";
			break;
		case "02":
			mesExtenso = "Fevereiro";
			break;
		case "03":
			mesExtenso = "Março";
			break;
		case "04":
			mesExtenso = "Abril";
			break;
		case "05":
			mesExtenso = "Maio";
			break;
		case "06":
			mesExtenso = "Junho";
			break;
		case "07":
			mesExtenso = "Julho";
			break;
		case "08":
			mesExtenso = "Agosto";
			break;
		case "09":
			mesExtenso = "Setembro";
			break;
		case "10":
			mesExtenso = "Outubro";
			break;
		case "11":
			mesExtenso = "Novembro";
			break;
		case "12":
			mesExtenso = "Dezembro";
			break;
		default:
			mesExtenso = "Mês não Encontrado!";
			break;
		}
        return mesExtenso;        
        }
}
        

