package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ClickPane
 * 
 * Full name:        System`ClickPane
 * 
 *                   ClickPane[image, func] represents a clickable pane that displays as image and applies func to the x, y coordinates of each click within the pane.
 *                   ClickPane[image, {{x   , y   }, {x   , y   }}, func] specifies the range of coordinates to use.
 * Usage:                                min   min     max   max
 * 
 *                   Method -> Preemptive
 *                   PassEventsDown -> Automatic
 * Options:          PassEventsUp -> True
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/ClickPane
 * Documentation:    web: http://reference.wolfram.com/language/ref/ClickPane.html
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
 * Default value:    None
 * 
 * Numeric values:   None
 */
fun clickPane(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ClickPane", arguments.toMutableList(), options)
}
