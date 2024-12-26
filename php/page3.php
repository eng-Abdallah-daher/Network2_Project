<?php
$ipNetToMediaIfIndex = snmp2_walk("localhost", "public", "1.3.6.1.2.1.4.22.1.1");
$ipNetToMediaPhysAddress = snmp2_walk("localhost", "public", "1.3.6.1.2.1.4.22.1.2");
$ipNetToMediaNetAddress = snmp2_walk("localhost", "public", "1.3.6.1.2.1.4.22.1.3");
$ipNetToMediaType = snmp2_walk("localhost", "public", "1.3.6.1.2.1.4.22.1.4");
for ($i = 0; $i < count($ipNetToMediaIfIndex); $i++) {
    echo $ipNetToMediaIfIndex[$i] . ",";
    echo $ipNetToMediaPhysAddress[$i] . ",";
    echo $ipNetToMediaNetAddress[$i] . ",";
    echo $ipNetToMediaType[$i] . "\n";
}