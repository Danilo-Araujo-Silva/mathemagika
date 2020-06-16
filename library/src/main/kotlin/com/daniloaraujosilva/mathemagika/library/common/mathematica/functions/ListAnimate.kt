package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ListAnimate
 *
 * Full name:        System`ListAnimate
 *
 *                   ListAnimate[{expr , expr , …}] generates an animation whose frames are the successive expr .
 *                                    1      2                                                                 i
 * Usage:            ListAnimate[list, fps] displays fps frames per second.
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
 *                   Bookmarks -> Automatic
 *                   ContentSize -> Automatic
 *                   ContinuousAction -> Automatic
 *                   ControlAlignment -> Automatic
 *                   ControllerLinking -> Automatic
 *                   ControllerMethod -> None
 *                   ControllerPath -> Automatic
 *                   ControlPlacement -> Automatic
 *                   ControlType -> Automatic
 *                   DefaultBaseStyle -> ListAnimate
 *                   DefaultDuration -> 5.
 *                   DefaultLabelStyle -> ListAnimateLabel
 *                   Deinitialization :> None
 *                   Deployed -> False
 *                   DisplayAllSteps -> True
 *                   Evaluator -> Automatic
 *                   Frame -> False
 *                   FrameMargins -> Automatic
 *                   FrameLabel -> None
 *                   ImageMargins -> 0
 *                   ImageSize -> All
 *                   Initialization :> None
 *                   InterpolationOrder -> Automatic
 *                   LabelStyle -> {}
 *                   LocalizeVariables -> True
 *                   Method -> Automatic
 *                   Paneled -> True
 *                   PausedTime -> Automatic
 *                   PreserveImageOptions -> True
 *                   RefreshRate -> Automatic
 *                   RotateLabel -> False
 *                   SaveDefinitions -> False
 *                   ShrinkingDelay -> 0
 *                   SynchronousInitialization -> True
 *                   SynchronousUpdating -> True
 *                   TouchscreenAutoZoom -> False
 *                   TouchscreenControlPlacement -> Automatic
 *                   TrackedSymbols -> Full
 *                   TransitionDirection -> Horizontal
 *                   TransitionDuration -> 0.5
 *                   TransitionEffect -> Automatic
 *                   UndoTrackedVariables :> None
 *                   UnsavedVariables :> None
 * Options:          UntrackedVariables :> None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ListAnimate
 * Documentation:    web: http://reference.wolfram.com/language/ref/ListAnimate.html
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
fun listAnimate(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ListAnimate", arguments.toMutableList(), options)
}
