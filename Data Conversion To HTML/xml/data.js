function data() {
    xml = new XMLHttpRequest();
    xml.open("GET", "data.xml", false);
    xml.send();

    xmlDoc = xml.responseXML;

    document.write("<table border='1'>");

    var x = xmlDoc.getElementsByTagName("restaurant_menu");

    document.write("<tr><th>");

    document.write("MenuId</th> <th>FoodCategory</th> <th>FoodItemName</th> <th>FoodIngredient</th> <th>Price</th> <th>Qty</th> </tr > ");

    for (i = 0; i < x.length; i++) {
        document.write("<tr><td>");
        document.write(x[i].getElementsByTagName("Menuid")[0].childNodes[0].nodeValue);
        document.write("</td><td>");
        document.write(x[i].getElementsByTagName("FoodCategory")[0].childNodes[0].nodeValue);
        document.write("</td><td>");
        document.write(x[i].getElementsByTagName("FoodItemName")[0].childNodes[0].nodeValue);
        document.write("</td><td>");
        document.write(x[i].getElementsByTagName("FoodIngredient")[0].childNodes[0].nodeValue);
        document.write("</td><td>");
        document.write(x[i].getElementsByTagName("Price")[0].childNodes[0].nodeValue);
        document.write("</td><td>");
        document.write(x[i].getElementsByTagName("Qty")[0].childNodes[0].nodeValue);
        document.write("</td></tr>");
    }
    document.write("</table>");
}