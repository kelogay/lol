var DATA = [
    {

        "NAME": "Mahipal",
        "AGE": 20,
        "City": "Valsad",
        "Country": "India"
    },

    {
        "NAME": "Parth",
        "AGE": 40,
        "City": "Mumbai",
        "Country": "India"
    },

    {
        "NAME": "Jatvik",
        "AGE": 69,
        "City": "Delhi",
        "Country": "India"
    },

    {
        "NAME": "Divya",
        "AGE": 99,
        "City": "Gully Boy",
        "Country": "India"
    },
];

function jsondata() {
    var header = Object.keys(DATA[0]);

    var row = "<tr>";
    for (var i = 0; i < header.length; i++) {
        row += "<th>" + header[i] + "</th>";
    }
    row += "</tr>";

    var allrecords = ""
    for (var j = 0; j < DATA.length; j++) {
        allrecords += "<tr>";
        for (var p = 0; p < header.length; p++) {
            var head = header[p];
            allrecords += "<td>" + DATA[j][head] + "</td>";
        }
        allrecords += "</tr>";
    }

    var table = document.getElementById("Display_Data");
    table.innerHTML = row + allrecords;
}
window.onload = jsondata();