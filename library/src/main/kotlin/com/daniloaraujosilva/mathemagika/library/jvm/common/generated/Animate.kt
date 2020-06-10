package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Animate
 * 
 * Full name:        System`Animate
 * 
 *                   Animate[expr, {u, u   , u   }] generates an animation of expr in which u varies continuously from u    to u   . 
 *                                      min   max                                                                       min     max
 *                   Animate[expr, {u, u   , u   , du}] takes u to vary in steps du. 
 *                                      min   max
 *                   Animate[expr, {u, {u , u , …}}] makes u take on discrete values u , u , …. 
 *                                       1   2                                        1   2
 * Usage:            Animate[expr, {u, …}, {v, …}, …] varies all the variables u, v, …. 
 * 
 *                   Alignment -> Automatic
 *                   AnimationDirection -> Forward
 *                   AnimationRate -> Automatic
 *                   AnimationRepetitions -> Infinity
 *                   AnimationRunning -> True
 *                   AnimationRunTime -> 0
 *                   AnimationTimeIndex -> Automatic
 *                   AppearanceElements -> Automatic
 *                   AutoAction -> False
 *                   AutorunSequencing -> Automatic
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> {}
 *                   Bookmarks -> {}
 *                   ContentSize -> Automatic
 *                   ContinuousAction -> Automatic
 *                   ControlAlignment -> Automatic
 *                   ControllerLinking -> Automatic
 *                   ControllerMethod -> None
 *                   ControllerPath -> Automatic
 *                   ControlPlacement -> Automatic
 *                   ControlType -> Automatic
 *                   DefaultBaseStyle -> Animate
 *                   DefaultDuration -> 5.
 *                   DefaultLabelStyle -> AnimateLabel
 *                   Deinitialization :> None
 *                   Deployed -> False
 *                   DisplayAllSteps -> False
 *                   Evaluator -> Automatic
 *                   Exclusions -> {}
 *                   Frame -> False
 *                   FrameLabel -> None
 *                   FrameMargins -> Automatic
 *                   ImageMargins -> 0
 *                   InterpolationOrder -> Automatic
 *                   Initialization :> None
 *                   LabelStyle -> {}
 *                   LocalizeVariables -> True
 *                   Method -> {}
 *                   Paneled -> True
 *                   PausedTime -> Automatic
 *                   PreserveImageOptions -> True
 *                   RefreshRate -> Automatic
 *                   RotateLabel -> False
 *                   SaveDefinitions -> False
 *                   ShrinkingDelay -> Automatic
 *                   SynchronousInitialization -> True
 *                   SynchronousUpdating -> True
 *                   TouchscreenAutoZoom -> False
 *                   TouchscreenControlPlacement -> Automatic
 *                   TrackedSymbols -> Full
 *                   UndoTrackedVariables :> None
 *                   UnsavedVariables :> None
 * Options:          UntrackedVariables :> None
 * 
 *                   HoldAll
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/Animate
 * Documentation:    web: http://reference.wolfram.com/language/ref/Animate.html
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
fun animate(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Animate", arguments.toMutableList(), options)
}
