package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ListStreamDensityPlot
 * 
 * Full name:        System`ListStreamDensityPlot
 * 
 *                   ListStreamDensityPlot[array] generates a stream density plot from a 2D array of vector and scalar field values {{vx  , vy  }, s  }. 
 *                                                                                                                                      ij    ij    ij
 *                   ListStreamDensityPlot[{{{x , y }, {{vx , vy }, s }}, …}] generates a stream density plot from vector and scalar field values {{vx , vy }, s } given at specified points {x , y }.
 *                                             1   1       1    1    1                                                                                i    i    i                              i   i
 *                   ListStreamDensityPlot[{data , data , …}] plots data for several vector and scalar fields. 
 * Usage:                                       1      2
 * 
 *                   AlignmentPoint -> Center
 *                   AspectRatio -> 1
 *                   Axes -> False
 *                   AxesLabel -> None
 *                   AxesOrigin -> Automatic
 *                   AxesStyle -> {}
 *                   Background -> None
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> {}
 *                   BoundaryStyle -> None
 *                   BoxRatios -> Automatic
 *                   ClippingStyle -> Automatic
 *                   ColorFunction -> Automatic
 *                   ColorFunctionScaling -> True
 *                   ColorOutput -> Automatic
 *                   ContentSelectable -> Automatic
 *                   CoordinatesToolOptions -> Automatic
 *                   DataRange -> Automatic
 *                   DisplayFunction :> $DisplayFunction
 *                   Epilog -> {}
 *                   Evaluated -> Automatic
 *                   EvaluationMonitor -> None
 *                   FormatType :> TraditionalForm
 *                   Frame -> True
 *                   FrameLabel -> None
 *                   FrameStyle -> {}
 *                   FrameTicks -> Automatic
 *                   FrameTicksStyle -> {}
 *                   GridLines -> None
 *                   GridLinesStyle -> {}
 *                   ImageMargins -> 0.
 *                   ImagePadding -> All
 *                   ImageSize -> Automatic
 *                   ImageSizeRaw -> Automatic
 *                   InterpolationOrder -> Automatic
 *                   LabelStyle -> {}
 *                   LightingAngle -> None
 *                   MaxRecursion -> Automatic
 *                   Mesh -> None
 *                   MeshFunctions -> Automatic
 *                   MeshShading -> None
 *                   MeshStyle -> Automatic
 *                   Method -> Automatic
 *                   NormalsFunction -> Automatic
 *                   PerformanceGoal :> $PerformanceGoal
 *                   PlotLabel -> None
 *                   PlotLegends -> None
 *                   PlotRange -> {Full, Full}
 *                   PlotRangeClipping -> True
 *                   PlotRangePadding -> Automatic
 *                   PlotRegion -> Automatic
 *                   PlotTheme :> $PlotTheme
 *                   PreserveImageOptions -> Automatic
 *                   Prolog -> {}
 *                   RegionBoundaryStyle -> Automatic
 *                   RegionFillingStyle -> Automatic
 *                   RegionFunction -> (True & )
 *                   RotateLabel -> True
 *                   StreamColorFunction -> None
 *                   StreamColorFunctionScaling -> True
 *                   StreamMarkers -> Automatic
 *                   StreamPoints -> Automatic
 *                   StreamScale -> Automatic
 *                   StreamStyle -> Automatic
 *                   TargetUnits -> Automatic
 *                   Ticks -> Automatic
 *                   TicksStyle -> {}
 *                   VectorAspectRatio -> Automatic
 *                   VectorColorFunction -> Automatic
 *                   VectorColorFunctionScaling -> True
 *                   VectorMarkers -> Automatic
 *                   VectorPoints -> None
 *                   VectorRange -> Automatic
 *                   VectorScale -> None
 *                   VectorScaling -> None
 *                   VectorSizes -> Automatic
 * Options:          VectorStyle -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/ListStreamDensityPlot
 * Documentation:    web: http://reference.wolfram.com/language/ref/ListStreamDensityPlot.html
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
fun listStreamDensityPlot(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ListStreamDensityPlot", arguments.toMutableList(), options)
}
