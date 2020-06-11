package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PaneSelector
 *
 * Full name:        System`PaneSelector
 *
 *                   PaneSelector[{v   expr , v   expr , …}, v] represents an object that displays as a pane containing the expr  for which v  is equal to v.
 * Usage:                           1       1   2       2                                                                         i            i
 *
 *                   Alignment -> {Automatic, Automatic}
 *                   AutoAction -> False
 *                   Background -> Automatic
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> {}
 *                   ContentPadding -> True
 *                   ContinuousAction -> True
 *                   DefaultBaseStyle -> PaneSelector
 *                   FrameMargins -> Automatic
 *                   ImageMargins -> 0
 *                   ImageSize -> All
 *                   TransitionDirection -> Left
 *                   TransitionDuration -> 0.5
 * Options:          TransitionEffect -> None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PaneSelector
 * Documentation:    web: http://reference.wolfram.com/language/ref/PaneSelector.html
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
fun paneSelector(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PaneSelector", arguments.toMutableList(), options)
}
