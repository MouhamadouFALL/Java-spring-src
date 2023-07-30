window.onload=function () {

    fetch('list')
      .then(response => response.json())
      .then(json => processJson(json));

};

function processJson(contacts){

    var table = document.getElementById("contacts-list");

    for (var i = 0; i < contacts.length; i++) {

        tr = table.insertRow(-1);
        tr.insertCell(-1).innerHTML=contacts[i].id;
        tr.insertCell(-1).innerHTML=contacts[i].firstName;
        tr.insertCell(-1).innerHTML=contacts[i].lastName;

    }

}