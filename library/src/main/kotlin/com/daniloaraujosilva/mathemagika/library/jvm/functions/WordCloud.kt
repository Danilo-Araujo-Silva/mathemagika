package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             WordCloud
 *
 * Full name:        System`WordCloud
 *
 *                   WordCloud[{s , s , …}] generates a word cloud graphic in which the s  are sized according to their multiplicity in the list.
 *                               1   2                                                   i
 *                   WordCloud[{w   s , …}] generates a word cloud in which the s  are sized according to the weights w .
 *                               1    1                                           i                                     i
 *                   WordCloud[ s   w , … ] also generates a word cloud in which the s  are sized according to the weights w .
 *                                1    1                                                 i                                     i
 *                   WordCloud[{w , w , …}  {s , s , …}] also generates a word cloud in which the s  are sized according to the weights w .
 *                               1   2         1   2                                                i                                     i
 *                   WordCloud[{{s , w }, {s , w }, …}] also generates a word cloud in which the s  are sized according to the weights w .
 *                                1   1     2   2                                                 i                                     i
 * Usage:            WordCloud[data, shape] fits the word cloud into the region defined by shape.
 *
 *                   AlignmentPoint -> Center
 *                   AspectRatio -> Automatic
 *                   Axes -> False
 *                   AxesLabel -> None
 *                   AxesOrigin -> Automatic
 *                   AxesStyle -> {}
 *                   Background -> GrayLevel[0, 0]
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> {}
 *                   ColorFunction -> Automatic
 *                   ColorFunctionScaling -> True
 *                   ColorOutput -> Automatic
 *                   ContentSelectable -> Automatic
 *                   CoordinatesToolOptions -> Automatic
 *                   DisplayFunction :> $DisplayFunction
 *                   Epilog -> {}
 *                   FontFamily -> Automatic
 *                   FontSize -> Automatic
 *                   FontTracking -> Automatic
 *                   FontWeight -> Automatic
 *                   FormatType :> TraditionalForm
 *                   Frame -> False
 *                   FrameLabel -> None
 *                   FrameStyle -> {}
 *                   FrameTicks -> Automatic
 *                   FrameTicksStyle -> {}
 *                   GridLines -> None
 *                   GridLinesStyle -> {}
 *                   IgnoreCase -> True
 *                   ImageMargins -> 0.
 *                   ImagePadding -> All
 *                   ImageSize -> Automatic
 *                   ImageSizeRaw -> Automatic
 *                   LabelStyle -> {}
 *                   MaxItems -> Automatic
 *                   Method -> Automatic
 *                   PlotLabel -> None
 *                   PlotRange -> Automatic
 *                   PlotRangeClipping -> False
 *                   PlotRangePadding -> Automatic
 *                   PlotRegion -> Automatic
 *                   PlotTheme -> Automatic
 *                   PreprocessingRules -> Automatic
 *                   PreserveImageOptions -> Automatic
 *                   Prolog -> {}
 *                   RandomSeeding -> Automatic
 *                   RotateLabel -> True
 *                   ScalingFunctions -> Identity
 *                   Ticks -> Automatic
 *                   TicksStyle -> {}
 *                   WordOrientation -> Horizontal
 *                   WordSelectionFunction -> Automatic
 * Options:          WordSpacings -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/WordCloud
 * Documentation:    web: http://reference.wolfram.com/language/ref/WordCloud.html
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
fun wordCloud(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WordCloud", arguments.toMutableList(), options)
}
