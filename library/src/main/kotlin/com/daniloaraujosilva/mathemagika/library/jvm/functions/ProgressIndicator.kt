package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ProgressIndicator
 *
 * Full name:        System`ProgressIndicator
 *
 *                   ProgressIndicator[x] represents a progress indicator with setting x in the range 0 to 1.
 *                   ProgressIndicator[Dynamic[x]] takes the setting to be the dynamically updated current value of x.
 *                   ProgressIndicator[x, {x   , x   }] represents a progress indicator with range x    to x   .
 *                                          min   max                                               min     max
 * Usage:            ProgressIndicator[x, Indeterminate] represents a progress indicator with indeterminate range.
 *
 *                   Appearance -> Automatic
 *                   AutoAction -> False
 *                   Background -> Automatic
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> {}
 *                   ContentPadding -> True
 *                   ContinuousAction -> True
 *                   DefaultBaseStyle -> ProgressIndicator
 *                   Enabled -> Automatic
 *                   ImageMargins -> 0
 * Options:          ImageSize -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ProgressIndicator
 * Documentation:    web: http://reference.wolfram.com/language/ref/ProgressIndicator.html
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
fun progressIndicator(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ProgressIndicator", arguments.toMutableList(), options)
}
