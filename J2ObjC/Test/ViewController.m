//
//  ViewController.m
//  Test
//
//  Created by Thomas Künneth on 03.04.16.
//  Copyright © 2016 Thomas Künneth. All rights reserved.
//

#import "ViewController.h"
#include "Rechnen.h"


@interface ViewController (
)

@property (weak, nonatomic) IBOutlet UILabel *nachricht;
@property (weak, nonatomic) IBOutlet UISegmentedControl *toggle;
@property (weak, nonatomic) IBOutlet UITextField *eingabe;

- (IBAction)Toggle:(id)sender;

@end

@implementation ViewController


- (void)viewDidLoad {
    [super viewDidLoad];
    // Do any additional setup after loading the view, typically from a nib.
}

- (void)didReceiveMemoryWarning {
    [super didReceiveMemoryWarning];
    // Dispose of any resources that can be recreated.
}

-(IBAction)Enter {
    NSString *message = @"";
    
    ComThomaskuennethTemperaturumrechnungRechnen *rechnen = [ComThomaskuennethTemperaturumrechnungRechnen new];
    jdouble wert = [rechnen string2doubleWithNSString:self.eingabe.text];
    
    switch ([self.toggle selectedSegmentIndex]) {
        case 0:
            wert = [rechnen celsius2fahrenheitWithDouble:wert];
            message = [rechnen fahrenheit2stringWithDouble:wert];
            break;
        case 1:
            wert = [rechnen fahrenheit2celsiusWithDouble:wert];
            message = [rechnen celsius2stringWithDouble:wert];
            break;
        default:
            break;
    }
    
    self.nachricht.text = message;
}

- (IBAction)Toggle:(id)sender {
}
@end
