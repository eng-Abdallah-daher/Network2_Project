<?php
$desc = snmp2_get("localhost", "public", ".1.3.6.1.2.1.1.1.0");
$id = snmp2_get("localhost", "public", ".1.3.6.1.2.1.1.2.0");
$time = snmp2_get("localhost", "public", ".1.3.6.1.2.1.1.3.0");
$contact = snmp2_get("localhost", "public", ".1.3.6.1.2.1.1.4.0");
$name = snmp2_get("localhost", "public", ".1.3.6.1.2.1.1.5.0");
$location = snmp2_get("localhost", "public", ".1.3.6.1.2.1.1.6.0");

// Edit items
if (isset($_POST['contact']) && isset($_POST['name']) && isset($_POST['location'])) {
    snmp2_set("localhost", "public", "1.3.6.1.2.1.1.4.0", "s", $_POST['contact']);
    snmp2_set("localhost", "public", "1.3.6.1.2.1.1.5.0", "s", $_POST['name']);
    snmp2_set("localhost", "public", "1.3.6.1.2.1.1.6.0", "s", $_POST['location']);

    $contact = snmp2_get("localhost", "public", ".1.3.6.1.2.1.1.4.0");
    $name = snmp2_get("localhost", "public", ".1.3.6.1.2.1.1.5.0");
    $location = snmp2_get("localhost", "public", ".1.3.6.1.2.1.1.6.0");
}

echo $desc . ",,,";
echo $id . ",,,";
echo $time . ",,,";
echo $contact . ",,,";
echo $name . ",,,";
echo $location . "\n";