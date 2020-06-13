package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ConnectSystemModelComponents
 *
 * Full name:        System`ConnectSystemModelComponents
 *
 *                   \!RowBox[{"ConnectSystemModelComponents", "[", RowBox[{RowBox[{"{", RowBox[{RowBox[{SubscriptBox[StyleBox["c", "TI"], StyleBox["1", "TR"]], "∈", SubscriptBox[StyleBox["comp", "TI"], StyleBox["1", "TR"]]}], ",", StyleBox["…", "TR"]}], "}"}], ",", RowBox[{"{", RowBox[{RowBox[{SubscriptBox[StyleBox["c", "TI"], StyleBox["1", "TR"]].StyleBox[a, TI], , SubscriptBox[StyleBox[c, TI], 2].StyleBox[b, TI]}], ,, StyleBox[…, TR]}], }}]}], ]}] creates a system model by connecting connector "a" of component "c " with connector "b" of component "c2" etc.
 * Usage:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    1
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ConnectSystemModelComponents
 * Documentation:    web: http://reference.wolfram.com/language/ref/ConnectSystemModelComponents.html
 *
 * Definitions:      None
 *
 * Own values:       None
 *
 * Down values:      None
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    Options[ConnectSystemModelComponents] := Cases[Options[WSMLink`WSMConnectComponents], HoldPattern[GraphLayout -> _]]
 *
 * Numeric values:   None
 */
fun connectSystemModelComponents(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ConnectSystemModelComponents", arguments.toMutableList(), options)
}
