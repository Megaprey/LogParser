/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar Log;

options
{
	language = Java;
}
@parser::namespace { Logs }
@lexer::namespace  { Logs }

@header{
       import java.util.List;
       import java.text.SimpleDateFormat;
       import java.util.*;
}

@members{
        List<Client> clients = new ArrayList<Client>(); 
}

log
    :statmenet+
    ;

statmenet
    :ip' - 'name = ID' ['date('+ '|' -')INT'] "'type = ID' 'address' ' protocol '" 'codeReturned = INT' 'INT NEWLINE?
     {
        Client client = new Client();
	client.setIP(((StatmenetContext)_localctx).ip.value);
	String dateString = String.valueOf(((StatmenetContext)_localctx).date.value);
        Date date = new SimpleDateFormat("dd/MMM/yyyy:HH:mm:ss", Locale.ENGLISH).parse(dateString);
	client.setDate(date);
	client.setMethodQueryHTTP(String.valueOf((((StatmenetContext)_localctx).type!=null?((StatmenetContext)_localctx).type.getText():null)));
	client.setCodeReturned(Integer.parseInt(String.valueOf((((StatmenetContext)_localctx).codeReturned!=null?((StatmenetContext)_localctx).codeReturned.getText():null))));
        clients.add(client);
     }
      
    ;
address
    :(('/'|'.')*(INT|ID)+)*;

protocol
    :(('/'|'.')*(INT|ID)+)*;

date returns[String value]
    :i1=INT{$value = $i1.text+"/";}'/'i2=ID{$value += $i2.text+"/";}'/'i3=INT{$value += $i3.text+":";}':'i4=INT{$value += $i4.text+":";}':'i5=INT{$value += $i5.text+":";}':'i6=INT{$value += $i6.text;};
                             
ip returns[String value]
    :i1=INT{$value = $i1.text+".";}'.'i2=INT{$value += $i2.text+".";}'.'i3=INT{$value += $i3.text+".";}'.'i4=INT{$value += $i4.text;};

Slash
    :'/';
INT : '-'?[0-9]+ ;
 
ID : [a-zA-Z_][a-zA-Z_0-9]* ;

NEWLINE : '\r'? '\n'
	;