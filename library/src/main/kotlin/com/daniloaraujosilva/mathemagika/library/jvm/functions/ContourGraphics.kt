package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ContourGraphics
 *
 * Full name:        System`ContourGraphics
 *
 * Usage:            ContourGraphics[array] is a representation of a contour plot.
 *
 *                   AspectRatio -> 1
 *                   Axes -> False
 *                   AxesLabel -> None
 *                   AxesOrigin -> Automatic
 *                   AxesStyle -> Automatic
 *                   Background -> Automatic
 *                   ColorFunction -> Automatic
 *                   ColorFunctionScaling -> True
 *                   ColorOutput -> Automatic
 *                   ContourLines -> True
 *                   Contours -> 10
 *                   ContourShading -> True
 *                   ContourSmoothing -> True
 *                   ContourStyle -> Automatic
 *                   DefaultColor -> Automatic
 *                   DefaultFont :> $DefaultFont
 *                   DisplayFunction :> $DisplayFunction
 *                   Epilog -> {}
 *                   FormatType :> $FormatType
 *                   Frame -> True
 *                   FrameLabel -> None
 *                   FrameStyle -> Automatic
 *                   FrameTicks -> Automatic
 *                   ImageSize -> Automatic
 *                   MeshRange -> Automatic
 *                   PlotLabel -> None
 *                   PlotRange -> Automatic
 *                   PlotRegion -> Automatic
 *                   Prolog -> {}
 *                   RotateLabel -> True
 *                   TextStyle :> $TextStyle
 * Options:          Ticks -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ContourGraphics
 * Documentation:    web: http://reference.wolfram.com/language/ref/ContourGraphics.html
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
fun contourGraphics(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ContourGraphics", arguments.toMutableList(), options)
}
