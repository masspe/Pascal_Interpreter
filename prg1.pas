program exFunction;
var
   x,a,q:integer;
   s:string;
procedure foo(i,k,l:integer);
begin
 writeln(i);
end;  
begin
s:="hello";
x:=4;
  case x of
   1: writeln('Gold medal');
   2: writeln('Silver medal');
   3: writeln('Bronze medal'); 
   else writeln('Better luck next time'); 
 end;
 foo(i);
end.