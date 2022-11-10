
dineroCofla = prompt("Cuanto dinero tienes Cofla?");

// Como nos salta un NaN cuando queremos hacer la resta del 2do alert, porque almacena el dato de dinero como un 'str' en vez de un 'int', debemos pasar ese dato de 'str' --> 'int', con la funcion 'parseInt()';

dineroCofla = parseInt(dineroCofla);


if (dineroCofla >= 0.6 && dineroCofla < 1) {
    alert("comprate el helado de agua");
    alert(" y te sobran" + (dineroCofla - 0.6));
}

else if (dineroCofla >= 1 && dineroCofla < 1.6) {
    alert("comprate el helado de crema");
    alert(" y te sobran" + (dineroCofla - 1));
}
else if (dineroCofla >= 1.6 && dineroCofla < 1.7) {
    alert("comprate el helado de heladix");
    alert(" y te sobran" + (dineroCofla - 1.6));
}
else if (dineroCofla >= 1.7 && dineroCofla < 1.8) {
    alert("comprate el helado de heladovich");
    alert(" y te sobran" + (dineroCofla - 1.7));
}
else if (dineroCofla >= 1.8 && dineroCofla < 2.9) {
    alert("comprate el helado de helardo");
    alert(" y te sobran" + (dineroCofla - 1.8));
}
else if (dineroCofla >= 2.9) {
    alert("comprate el helado con confites o 1/4 kg");
    alert(" y te sobran" + (dineroCofla - 2.9));
}
else {
    alert("lo siento, pobre de mierda, no te alcanza");
}



dineroRoberto = prompt("Cuanto dinero tienes Roberto?");
dineroRoberto = parseInt(dineroRoberto);

if (dineroRoberto >= 0.6 && dineroRoberto < 1) {
    alert("comprate el helado de agua");
    alert("y te sobra" + (dineroRoberto - 0.6));
}

else if (dineroRoberto >= 1 && dineroRoberto < 1.6) {
    alert("comprate el helado de crema");
    alert("y te sobra" + (dineroRoberto - 1));
}
else if (dineroRoberto >= 1.6 && dineroRoberto < 1.7) {
    alert("comprate el helado de heladix");
    alert("y te sobra" + (dineroRoberto - 1.6));
}
else if (dineroRoberto >= 1.7 && dineroRoberto < 1.8) {
    alert("comprate el helado de heladovich");
    alert("y te sobra" + (dineroRoberto - 1.7));
}
else if (dineroRoberto >= 1.8 && dineroRoberto < 2.9) {
    alert("comprate el helado de helardo");
    alert("y te sobra" + (dineroRoberto - 1.8));
}
else if (dineroRoberto >= 2.9) {
    alert("comprate el helado con confites o 1/4 kg");
    alert("y te sobra" + (dineroRoberto - 2.9));
}
else {
    alert("lo siento, pobre de mierda, no te alcanza");
}



dineroPedro = prompt("Cuanto dinero tienes Pedro?");
dineroPedro = parseInt(dineroPedro);

if (dineroPedro >= 0.6 && dineroPedro < 1) {
    alert("comprate el helado de agua");
    alert(" y te sobran" + (dineroPedro - 0.6));
}

else if (dineroPedro >= 1 && dineroPedro < 1.6) {
    alert("comprate el helado de crema");
    alert(" y te sobran" + (dineroPedro - 1));
}
else if (dineroPedro >= 1.6 && dineroPedro < 1.7) {
    alert("comprate el helado de heladix");
    alert(" y te sobran" + (dineroPedro - 1.6));
}
else if (dineroPedro >= 1.7 && dineroPedro < 1.8) {
    alert("comprate el helado de heladovich");
    alert(" y te sobran" + (dineroPedro - 1.7));
}
else if (dineroPedro >= 1.8 && dineroPedro < 2.9) {
    alert("comprate el helado de helardo");
    alert(" y te sobran" + (dineroPedro - 1.8));
}
else if (dineroPedro >= 2.9) {
    alert("comprate el helado con confites o 1/4 kg");
    alert(" y te sobran" + (dineroPedro - 2.9));
}
else {
    alert("lo siento, pobre de mierda, no te alcanza");
}