<?php
$tcpLocalAddress = snmp2_walk("localhost", "public", ".1.3.6.1.2.1.6.13.1.2");
$tcpLocalPort = snmp2_walk("localhost", "public", ".1.3.6.1.2.1.6.13.1.3");
for ($i = 0; $i < count($tcpLocalAddress); $i++) {
    echo $tcpLocalAddress[$i] . ",";
    echo $tcpLocalPort[$i] . "\n";
}