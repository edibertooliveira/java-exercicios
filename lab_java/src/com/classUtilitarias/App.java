package com.classUtilitarias;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.*;

public class App {
    public static void main(String[] args) {
//        mathExemplos()
//        datasExemplos();
//        formatDataExemplo();
//        formatData02Exemplo();
//        timeZoneExemplo();
//        calcDatasExemplo();
//        aleatorioExemplo();

    }

    public static void aleatorioExemplo() {
        System.out.println(Math.round(Math.random() * 100)); // aleatorio
        Random aleatorio = new Random();
        System.out.println(aleatorio.nextInt(101));
    }


    public static void timeZoneExemplo() {
        Calendar hj = Calendar.getInstance();
        TimeZone tz = hj.getTimeZone();
        String[] fuso = TimeZone.getAvailableIDs();
//        for (String zone : fuso ) {
//            System.out.println(zone); // aleatorio
//        }
        TimeZone tzSP = TimeZone.getTimeZone("America/Sao_Paulo");
        Calendar hojeSP = Calendar.getInstance(tzSP);
        System.out.println(hojeSP.getTime());
        System.out.println(tzSP.getDisplayName());

        hojeSP.add(Calendar.HOUR_OF_DAY, tzSP.getOffset(System.currentTimeMillis() /1000/60/60));
        System.out.println(hojeSP.getTime());
        System.out.println("---------");

        LocalDate agora = LocalDate.now();
        System.out.println(agora);
        System.out.println(agora.plusDays(30));
        System.out.println(agora.getDayOfWeek());
        System.out.println(agora.getDayOfMonth());
        System.out.println(agora.getDayOfYear());

        System.out.println(LocalDate.of(2019,2,1));
        System.out.println(LocalDate.parse("2019-05-08"));
        System.out.println(LocalDate.parse("2020-05-08").isLeapYear());

        LocalTime hojeHoras = LocalTime.now();
        System.out.println(hojeHoras);

        ZoneId fuso02 = ZoneId.of("Canada/Saskatchewan");
        ZoneId fuso03 = ZoneId.systemDefault();
        System.out.println(fuso02);
        System.out.println(ZoneId.of("Canada/Saskatchewan"));
        ZonedDateTime hora02 = ZonedDateTime.now(fuso02);
        ZonedDateTime hora03 = ZonedDateTime.now(fuso03);
        System.out.println(hora02);
        System.out.println(hora03);

    }

    public static void formatData02Exemplo() {
        Date hoje = new Date();
        String hojeFormatado = DateFormat.getInstance().format(hoje);

        System.out.println(Locale.getDefault());
        System.out.println(hojeFormatado);

        hojeFormatado = DateFormat.getTimeInstance().format(hoje);
        System.out.println(hojeFormatado);

        hojeFormatado = DateFormat.getDateInstance().format(hoje);
        System.out.println(hojeFormatado);

        Locale.setDefault(new Locale("en", "us"));

        hojeFormatado = DateFormat.getDateTimeInstance().format(hoje);
        System.out.println(hojeFormatado);

        hojeFormatado = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT).format(hoje);
        System.out.println(hojeFormatado);

    }

    public static void formatDataExemplo() {
        SimpleDateFormat format = new SimpleDateFormat("dd/MMM/yyyy hh:mm:ss a");
        Calendar hoje = Calendar.getInstance();
        String format1 = format.format(hoje.getTime());
        System.out.println(format1); // 06/mai/2021 01:17:19 PM
    }

    public static void mathExemplos() {
        //  Math
        System.out.println(Math.pow(2, 5)); //32.0

        System.out.println(Math.round(2.5)); //3
        System.out.println(Math.round(2.4)); //2

        System.out.println(Math.ceil(2.4)); //3

        System.out.println(Math.floor(2.9)); //2

        System.out.println(Math.round(Math.random() * 10)); //entre 1 a 10

        System.out.println(Math.sin(Math.toRadians(30))); //0.499+
    }

    public static void datasExemplos() {
        //  Datas

        Date hoje = new Date();
        Calendar novoHoje = Calendar.getInstance();

        int dia = novoHoje.get(Calendar.DAY_OF_MONTH);
        int mes = novoHoje.get(Calendar.WEEK_OF_MONTH);
        int ano = novoHoje.get(Calendar.YEAR);
        int hora = novoHoje.get(Calendar.HOUR_OF_DAY);
        int minutos = novoHoje.get(Calendar.MINUTE);
        int segundos = novoHoje.get(Calendar.SECOND);

        GregorianCalendar superHoje = new GregorianCalendar();


        System.out.println(hoje); // Thu May 06 11:44:29 BRT 2021
        System.out.println(hoje.getTime()); // 1620312488345
        System.out.println(hoje.getDate());
        System.out.println("--------");

        System.out.printf("Hoje é: %02d/%02d/%02d\n", dia, mes, ano); // Hoje é: 06/02/2021

        System.out.println(novoHoje.getTime()); // Thu May 06 11:44:29 BRT 2021
        System.out.println(dia); // dia 6
        System.out.println(mes); // semana do mes 2
        System.out.println(ano); // ano 2021

        novoHoje.add(Calendar.DAY_OF_MONTH, 2);
        System.out.println(novoHoje.getTime()); // dia 8

        System.out.println(novoHoje);
        /*
        java.util.GregorianCalendar[
        time=1620313454988,
        areFieldsSet=true,
        areAllFieldsSet=true,
        lenient=true,
        zone=sun.util.calendar.ZoneInfo[
        id="America/Bahia",
        offset=-10800000,
        dstSavings=0,
        useDaylight=false,
        transitions=63,
        lastRule=null],
        firstDayOfWeek=1,
        minimalDaysInFirstWeek=1,
        ERA=1,
        YEAR=2021,
        MONTH=4,
        WEEK_OF_YEAR=19,
        WEEK_OF_MONTH=2,
        DAY_OF_MONTH=6,
        DAY_OF_YEAR=126,
        DAY_OF_WEEK=5,
        DAY_OF_WEEK_IN_MONTH=1,
        AM_PM=1,
        HOUR=0,
        HOUR_OF_DAY=12,
        MINUTE=4,
        SECOND=14,
        MILLISECOND=988,
        ZONE_OFFSET=-10800000,
        DST_OFFSET=0]
         */

        System.out.println(superHoje);
        System.out.println(superHoje.isLeapYear(2020));

        GregorianCalendar superData = new GregorianCalendar(2017, 00, 5);
        System.out.println(superData);

    }


}
