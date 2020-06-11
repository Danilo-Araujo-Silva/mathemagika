package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SlideView
 *
 * Full name:        System`SlideView
 *
 *                   SlideView[{expr , expr , …}] represents an object in which the expr  are set up to be displayed on successive slides.
 *                                  1      2                                            i
 *                                                               th
 *                   SlideView[{expr , expr , …}, i] makes the i   slide be the one currently displayed.
 * Usage:                           1      2
 *
 *                   Alignment -> Automatic
 *                   AlignmentPoint -> Automatic
 *                   AnimationRunning -> False
 *                   AnimationRunTime -> 0
 *                   AnimationTimeIndex -> Automatic
 *                   AppearanceElements -> Automatic
 *                   Background -> None
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> {}
 *                   ControlPlacement -> Top
 *                   DefaultBaseStyle -> SlideView
 *                   Deployed -> False
 *                   Enabled -> Automatic
 *                   FrameMargins -> Automatic
 *                   ImageMargins -> Automatic
 *                   ImageSize -> All
 *                   TransitionDirection -> Horizontal
 *                   TransitionDuration -> 0.5
 * Options:          TransitionEffect -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SlideView
 * Documentation:    web: http://reference.wolfram.com/language/ref/SlideView.html
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
fun slideView(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SlideView", arguments.toMutableList(), options)
}
